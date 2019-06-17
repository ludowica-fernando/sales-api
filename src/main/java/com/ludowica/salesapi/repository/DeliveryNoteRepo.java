package com.ludowica.salesapi.repository;

import com.ludowica.salesapi.models.DeliveryNotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryNoteRepo extends JpaRepository<DeliveryNotes, Integer> {
}
