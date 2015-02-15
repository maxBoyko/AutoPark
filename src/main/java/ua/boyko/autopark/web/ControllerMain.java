package ua.boyko.autopark.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.boyko.autopark.model.Car;
import ua.boyko.autopark.service.ICarService;

@Controller
public class ControllerMain {
	@Autowired
    private ICarService carService;

    @RequestMapping("/index")
    public String listCar(Map<String, Object> map) {

        map.put("car", new Car());
        map.put("carList", carService.listCar());

        return "car";
    }
    
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCar(@ModelAttribute("car") Car car,
            BindingResult result) {

        carService.addCar(car);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{carId}")
    public String deleteCar(@PathVariable("carId") Integer carId) {

        carService.removeCar(carId);

        return "redirect:/index";
    }

}
