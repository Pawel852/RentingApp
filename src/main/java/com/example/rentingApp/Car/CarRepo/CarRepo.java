package com.example.rentingApp.Car.CarRepo;

import com.example.rentingApp.Car.CarModel.CarModel;
import com.example.rentingApp.Client.ClientModel.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface CarRepo extends JpaRepository<CarModel, Long> {
    CarModel findByBrand(String brand);
    CarModel findByModel(String model);

}
