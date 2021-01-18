package com.example.demo.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table
@Data
@NoArgsConstructor
public class Restaurant {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Long id;
private String name;
private String status;
private LocalDate date;


    public Restaurant(String name, String status, LocalDate of) {
        this.name=name;
        this.status=status;
        this.date=of;
    }
}
