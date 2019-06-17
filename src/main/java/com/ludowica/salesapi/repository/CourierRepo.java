package com.ludowica.salesapi.repository;

import com.ludowica.salesapi.models.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepo extends JpaRepository<Courier, Integer> {
}
