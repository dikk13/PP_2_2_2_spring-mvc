package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.controller.CarController;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class ServiceCarImpl implements ServiceCar{

    private final CarDao carDao;
    @Autowired
    public ServiceCarImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars.add(carDao.getCars().get(i));
        }
        return cars;
    }
}
