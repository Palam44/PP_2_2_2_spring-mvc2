package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private static List<Car> cars;

    public List<Car> getCars(int count) {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "3"));
        cars.add(new Car(2, "BMW", "5"));
        cars.add(new Car(3, "Ferrari", "360"));
        cars.add(new Car(4, "VW", "golf 6"));
        cars.add(new Car(5, "VW", "golf 7"));

        if (count > cars.size() | count < 0) {
            count = cars.size();
        }

        return cars.stream().limit(count).toList();

    }
}