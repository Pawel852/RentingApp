package com.example.rentingapp.car.cardto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CarDto {

    private String brand;
    private String model;
    private String type;
    private int seats;
    private String fuel;
    private String transmission;
    private String color;
    private double pricePerDay;
    private String image;
    private String description;
    private boolean available;
    private String location;
}
