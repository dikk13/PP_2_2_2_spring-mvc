package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.*;
@Component
public class CarDao {

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("1", 1, 1));
        cars.add(new Car("2", 2, 2));
        cars.add(new Car("3", 3, 3));
        cars.add(new Car("4", 4, 4));
        cars.add(new Car("5", 5, 5));
    }

    public List<Car> getCars() {return cars;}


}
