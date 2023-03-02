package hw1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private String model;
    private int power;
    private double volumeEngine;
    private String turbo;
}


