package com.example.demo.services;

import com.example.demo.pojos.Restaurant;
import com.example.demo.repos.RestaurentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RestaurantService {
    @Autowired
    private RestaurentRepo repo;
    public List<Restaurant> getRestaurants()
    {

        return repo.findAll();
    }
    public void deleteRestaurant(Long id)

    {
   Restaurant restaurant=repo.findById( id ).get();
    repo.deleteById( id );
    }
}
