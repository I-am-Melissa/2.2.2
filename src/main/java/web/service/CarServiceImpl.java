package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", 300));
        cars.add(new Car(2, "Tesla", 3));
        cars.add(new Car(3, "Audi", 3));
        cars.add(new Car(4, "BMW", 3));
        cars.add(new Car(5, "Ford", 150));
    }

    @Override
    public List<Car> carsCount(int num) {
        if (num >= 5 || num < 0) {
            return cars.subList(0, 5);
        } else {
            return cars.subList(0, num);
        }
    }
}