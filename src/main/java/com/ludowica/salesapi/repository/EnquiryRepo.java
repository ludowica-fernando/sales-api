package com.ludowica.salesapi.repository;

import com.ludowica.salesapi.models.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnquiryRepo extends JpaRepository<Enquiry, Integer> {
    Optional<Enquiry> findByCustomerId(int customerId);
}