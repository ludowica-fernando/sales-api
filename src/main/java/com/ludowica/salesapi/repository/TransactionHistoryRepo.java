package com.ludowica.salesapi.repository;

import com.ludowica.salesapi.models.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHistoryRepo extends JpaRepository<TransactionHistory, Integer> {
}
