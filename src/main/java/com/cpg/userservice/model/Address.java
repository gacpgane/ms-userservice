package com.cpg.userservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ADDRESS")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="STREET" )
    private String street;

    @Column(name="CITY")
    private String city;

    @Column(name="STATE")
    private String state;

    @Column(name = "ZIP", nullable = false)
    private String zip;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private User user;

}
