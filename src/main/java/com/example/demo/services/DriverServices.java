package com.example.demo.services;

import com.example.demo.model.Driver;
import com.example.demo.repository.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriverServices {

    @Autowired
    private DriverRepo driverRepo;

/*
 *  Possibility to change void type (to int) and add return
 *  instead on the following method. (we have exception errors)
 */
    public void addDriver(Driver driver){
        driverRepo.save(driver);
    }

    public List<Driver> findAll(){

        return driverRepo.findAll();
    }
}
