package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.service.ServiceCarImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    private final ServiceCarImpl serviceCar;
    @Autowired
    public CarController(ServiceCarImpl serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", serviceCar.getCars(5));
        } else if (count > 0) {
            model.addAttribute("cars", serviceCar.getCars(count));
        }
//        System.out.println(count);
        return "cars";
    }
}
