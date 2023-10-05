package com.example.myrestapiserver.myrestapiserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarApi {

    @Autowired
    private CarManager carManager;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/getCars")
    public List<Car> displayCars() {
        return carManager.getCarList();
    }

    @PostMapping("/addCar")
    public String addCar(@RequestBody Car car) {
        return carManager.addCar(car);
    }

}
