package com.hoya.project.pharmacy.repository;

import com.hoya.project.pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}