package com.example.api.service;

import com.example.api.dto.EventRequestDTO;
import com.example.api.model.Address;
import com.example.api.model.Event;
import com.example.api.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO eventRequestDTO, Event event) {
        Address adress = new Address();
        adress.setCity(eventRequestDTO.city());
        adress.setUf(eventRequestDTO.state());
        adress.setEvent(event);

        return addressRepository.save(adress);


    }
}
