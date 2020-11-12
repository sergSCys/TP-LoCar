package com.example.demo.services;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServices {

    private CarRepo carRepo;

    public void createCar(Car car){

        carRepo.save(car);
    }

    public List<Car> findAll() {
        return carRepo.findAll();
    }
}
