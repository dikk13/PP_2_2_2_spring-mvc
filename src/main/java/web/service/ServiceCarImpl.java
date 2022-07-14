package web.service;

import web.controller.CarController;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceCarImpl implements ServiceCar{


    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars.add(CarController.cars.get(i));
        }
        return cars;
    }
}
