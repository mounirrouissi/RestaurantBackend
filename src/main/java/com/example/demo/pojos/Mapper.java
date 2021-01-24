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
        Client cl = new Client();
        cl.setId(c.getId());
        cl.setName(c.getName());
        cl.setEmail(c.getEmail());
        cl.setPlaces(c.getPlaces());
        cl.setRestaurantName(s);

        return cl;
    }

}
