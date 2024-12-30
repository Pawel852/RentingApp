package com.example.rentingApp.Car.CarService;

import com.example.rentingApp.Car.CarModel.CarModel;
import com.example.rentingApp.Car.CarRepo.CarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }
    public CarRepo getCarRepo() {
        return carRepo;
    }
    public void addCar(CarModel carModel) {
        carRepo.save(carModel);
    }
    public void deleteCar(Long id) {
        carRepo.deleteById(id);
    }
    public void updateCar(CarModel carModel, Long id) {
        carRepo.findById(id).ifPresent(car -> {
            car.setOwner(carModel.getOwner());
            car.setBrand(carModel.getBrand());
            car.setModel(carModel.getModel());
            car.setType(carModel.getType());
            car.setSeats(carModel.getSeats());
            car.setFuel(carModel.getFuel());
            car.setTransmission(carModel.getTransmission());
            car.setColor(carModel.getColor());
            car.setPricePerDay(carModel.getPricePerDay());
            car.setImage(carModel.getImage());
            car.setDescription(carModel.getDescription());
            car.setAvailable(carModel.isAvailable());
            car.setLocation(carModel.getLocation());

            carRepo.save(car);
        });
    }
    public List<CarModel> getCars() {
        return carRepo.findAll();
    }

    public CarModel getCarById(Long id) {
        return carRepo.findById(id).orElse(null);
    }
    public CarModel getCarByModel(String model) {
        return carRepo.findByModel(model);
    }
    public CarModel getCarByBrand(String brand) {
        return carRepo.findByBrand(brand);
    }
}
