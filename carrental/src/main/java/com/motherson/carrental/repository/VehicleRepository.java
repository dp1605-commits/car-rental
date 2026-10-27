package com.motherson.carrental.repository;

import com.motherson.carrental.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByAvailableTrue();

    List<Vehicle> findByCategoryId(Long categoryId);

    List<Vehicle> findByNameContainingIgnoreCase(String name);
}