package com.example.rentingApp.Car.CarMapper;

import com.example.rentingApp.Car.CarDto.CarDto;
import com.example.rentingApp.Car.CarModel.CarModel;

public class CarMapper {

    public static CarModel mapCarDtoToCarModel(CarDto carDto) {

        return CarModel.builder()
                .brand(carDto.getBrand())
                .model(carDto.getModel())
                .type(carDto.getType())
                .seats(carDto.getSeats())
                .fuel(carDto.getFuel())
                .transmission(carDto.getTransmission())
                .color(carDto.getColor())
                .pricePerDay(carDto.getPricePerDay())
                .image(carDto.getImage())
                .description(carDto.getDescription())
                .available(carDto.isAvailable())
                .location(carDto.getLocation())
                .build();



    }
}
