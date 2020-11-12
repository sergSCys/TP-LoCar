package com.example.demo.repository;


import com.example.demo.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Driver, Long> {

  //  @Query(value = "SELECT count(*) FROM driver")
}
