package com.duoc.traveler_service.repository;

import com.duoc.traveler_service.model.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelerRepository extends JpaRepository<Traveler, Long> {
    
}
