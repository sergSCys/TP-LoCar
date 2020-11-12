package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private String model;
    private String matricule;


    @ManyToMany(mappedBy = "bookings")
    private List<Driver> drivers;

    public Car() {
    }

    public Car(String brand, String model, String matricule) {
        this.brand = brand;
        this.model = model;
        this.matricule = matricule;
    }

    public Car(long id, String brand, String model, String matricule) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricule = matricule;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}


