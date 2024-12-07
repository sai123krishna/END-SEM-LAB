package com.klef.jfsd.exam.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    // Getters and Setters
}
