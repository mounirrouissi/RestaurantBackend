package com.example.demo.controller;


import com.example.demo.pojos.Client;
import com.example.demo.pojos.Mapper;
import com.example.demo.repos.ClientRepo;
import com.example.demo.services.ClientService;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;


@RestController
@CrossOrigin("*")
public class ClientController {
    private ClientRepo clientRepo;
    private ClientService service;
private Mapper mapper;


    public ClientController(ClientRepo clientRepo, ClientService service, Mapper mapper) {
        this.clientRepo = clientRepo;
        this.service = service;
        this.mapper = mapper;
    }

@GetMapping("/restaurants/reservations")
public List<Client> getReservations(){
    return service.getReservations();
}
    @PostMapping("/restaurants/reservation/{RestaurantName]")
    public Client addReservation(@PathVariable String name, @RequestBody Client client, BindingResult bindingResult) throws ValidationException {
        if (bindingResult.hasErrors()) {
            throw new ValidationException( "problem" );
        }
Client client1=mapper.convertToClietn( client,name );
        return service.addReservation(client1);
    }
}
