package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceIml implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Ford", "RED", 1000));
        cars.add(new Car("Ferrari", "YELLOW", 700));
        cars.add(new Car("Aston Martin", "BLACK", 500));
        cars.add(new Car("FIAT", "GREEN", 180));
        cars.add(new Car("BMW", "BLUE", 100));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
