package com.ludowica.salesapi.repository;

import com.ludowica.salesapi.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepo extends JpaRepository<Orders, Integer> {
}
