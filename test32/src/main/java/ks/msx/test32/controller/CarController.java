package ks.msx.test32.controller;

import ks.msx.test32.model.Car;
import ks.msx.test32.repository.CarRepository;
import ks.msx.test32.service.CarService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class CarController {

    @GetMapping("/")
    public String index(Model model){
        Car car = new Car();
        model.addAttribute("addCar", car);
        return "index";
    }

    private final CarService carService;

    public CarController(CarService carService, CarRepository carRepository) {
        this.carService = carService;
    }


    @GetMapping()
    public List<Car> findAllCars(){
        return carService.getCars();
    }

    @PostMapping("/add")
    public void saveCar(@ModelAttribute("addCar") Car car, Model model){
        System.out.println(car.toString());
        carService.saveCar(car);
    }

    @DeleteMapping("/id")
    public Car deleteCar(@RequestBody Car car, Integer car_id){
        return carService.updateCar(car, car_id);
    }
}
