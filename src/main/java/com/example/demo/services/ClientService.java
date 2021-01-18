package com.example.demo.services;

import com.example.demo.pojos.Client;
import com.example.demo.repos.ClientRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import javax.xml.bind.ValidationException;
import java.util.List;


@Service
public class ClientService {
    private ClientRepo clientRepo;


    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public Client addReservation(Client s){

        return clientRepo.save(s );
    }


    public List<Client> getReservations(){
        return clientRepo.findAll();
    }
}
