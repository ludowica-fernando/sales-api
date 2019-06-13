package com.ludowica.salesapi.repository;

import com.ludowica.salesapi.models.EnquiryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryItemRepo extends JpaRepository<EnquiryItem, Integer> {
}
