package com.example.rentingapp.car.carrepo;

import com.example.rentingapp.car.carmodel.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<CarModel, Long> {
    CarModel findByBrand(String brand);
    CarModel findByModel(String model);

}
