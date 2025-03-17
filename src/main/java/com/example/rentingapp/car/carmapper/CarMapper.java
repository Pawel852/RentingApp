package com.example.rentingapp.car.carmapper;

import com.example.rentingapp.car.cardto.CarDto;
import com.example.rentingapp.car.carmodel.CarModel;



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
