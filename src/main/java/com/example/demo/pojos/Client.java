package com.example.demo.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private int places;
    private String RestaurantName;


    public Client(String name, String email, int places, String restaurantName) {
        this.name = name;
        this.email = email;
        this.places = places;
        RestaurantName = restaurantName;
    }
}
