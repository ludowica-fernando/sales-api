package com.ludowica.salesapi.repository;

import com.ludowica.salesapi.models.CustomerContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactRepo extends JpaRepository<CustomerContact, Integer> {
}