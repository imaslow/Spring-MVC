package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceIml;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceIml carServiceIml = new CarServiceIml();
    List<Car> cars = new ArrayList<>();

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        cars.add(new Car("Ford", "RED", 1000));
        cars.add(new Car("Ferrari", "YELLOW", 700));
        cars.add(new Car("Aston Martin", "BLACK", 500));
        cars.add(new Car("FIAT", "GREEN", 180));
        cars.add(new Car("BMW", "BLUE", 100));
        cars = carServiceIml.getCars(cars, allCars);
        model.addAttribute("cars", cars);
        return "cars";
    }


}
