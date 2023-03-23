package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.car.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("LADA", "Priora", "Ashot"));
        cars.add(new Car("Toyota", "Prius", "Nikita"));
        cars.add(new Car("Kia", "Soul", "Irina"));
        cars.add(new Car("Mersedes", "C-class", "Dimon"));
        cars.add(new Car("BMW", "X5", "Vitalic"));
        cars = CarService.showCars(cars, allCars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
