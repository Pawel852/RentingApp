package com.example.rentingapp.car.carcontroller;

import com.example.rentingapp.car.carmodel.CarModel;
import com.example.rentingapp.car.carservice.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService ;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/add")
    public void addCar(@RequestBody CarModel carModel) {
        carService.addCar(carModel);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
    @PutMapping("/update/{id}")
    public void updateCar(@RequestBody CarModel carModel, @PathVariable Long id) {
        carService.updateCar(carModel, id);
    }
    @GetMapping
    public List<CarModel> getCars() {
        return carService.getCars();
    }

}
