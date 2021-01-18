package com.example.demo.repos;

import com.example.demo.pojos.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurentRepo extends JpaRepository<Restaurant,Long> {
}
