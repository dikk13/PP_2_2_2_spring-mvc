package model;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ServiceCar {

    List<Car> getCars(int number);
}
