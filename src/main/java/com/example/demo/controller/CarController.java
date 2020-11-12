package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CarController {
    @Autowired
    private CarServices carServices;

    //@RequestMapping(value = "/cars", method = GetMapping)
    @GetMapping("/car")
    public String car(Model model){
        model.addAttribute("cars");
        return ("/car");
    }
    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public String car(@Validated Car car, BindingResult bindingResult) {

        if (bindingResult.hasErrors()){
            System.out.println("Kick the Squirrel!!!");
        }
        carServices.createCar(car);

        return "redirect:/"; // redirect to home page after inserting data
    }

}
