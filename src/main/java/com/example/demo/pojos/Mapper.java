package com.example.demo.pojos;

import com.example.demo.repos.ClientRepo;
import org.springframework.stereotype.Component;


/**
 * Component that handles all mappings in this project
 * - c to view model
 * - view model to c
 * <p>
 * All mappings are handled here, but in production code this is not the
 * best approach. You can take a look at ModelMapper project or at least split mapping classes
 * across many files.
 */

@Component
public class Mapper {
    private ClientRepo clientRepo;


    public Mapper(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }


    public Client convertToClietn(Client c,String s) {
        var Client = new Client();
        Client.setId(c.getId());
        Client.setName(c.getName());
        Client.setEmail(c.getEmail());
        Client.setPlaces(c.getPlaces());
        Client.setRestaurantName(s);

        return Client;
    }

}
