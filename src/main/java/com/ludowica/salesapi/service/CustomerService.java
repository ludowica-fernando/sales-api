package com.ludowica.salesapi.service;

import com.ludowica.salesapi.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

}
