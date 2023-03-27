package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIml;



@Controller
public class CarController {
    private final CarServiceIml carServiceIml;
    public CarController(CarServiceIml carServiceIml) {
        this.carServiceIml = carServiceIml;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carServiceIml.getCars(count));
        return "cars";
    }


}
