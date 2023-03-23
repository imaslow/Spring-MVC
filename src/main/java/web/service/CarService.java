package web.service;

import web.car.Car;

import java.util.List;
import java.util.stream.Collectors;

public interface CarService {
        static List<Car> showCars(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }

}
