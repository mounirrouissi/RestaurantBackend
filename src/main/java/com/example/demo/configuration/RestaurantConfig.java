package com.example.demo.configuration;

import com.example.demo.pojos.Client;
import com.example.demo.pojos.Restaurant;
import com.example.demo.repos.ClientRepo;
import com.example.demo.repos.RestaurentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

import static java.util.Calendar.JANUARY;


@Configuration
public class RestaurantConfig {

    @Bean
    CommandLineRunner commandLineRunner(RestaurentRepo restaurentRepo, ClientRepo clientRepo)
    {
        return args -> {
            Restaurant restaurant=new Restaurant("The_Local","Available",
                    LocalDate.of(2000, Month.MAY,2));
            restaurentRepo.save( restaurant );
            Client client=new Client("Salim","dfdf@gmail.com",2,"The Cave");
            clientRepo.save( client );
        };

    }
}
