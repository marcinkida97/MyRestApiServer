package com.example.myrestapiserver.myrestapiserver;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Service
public class CarManager {

    private List<Car> carList;

    public CarManager() {
        this.carList = new ArrayList<>();
        carList.add(new Car("Fiat", "Panda"));
        carList.add(new Car("Volkswagen", "Passat"));
        carList.add(new Car("Audi", "A4"));
    }

    public String addCar(Car car) {
        carList.add(car);
        return "Car added successfully (mark: " + car.getMark() + ", model: " + car.getModel() + ")";
    }
}
