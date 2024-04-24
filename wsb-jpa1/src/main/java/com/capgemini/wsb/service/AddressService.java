package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.AddressTO;
import org.springframework.stereotype.Service;

@Service
public interface AddressService
{
    public AddressTO findById(final Long id);
}
