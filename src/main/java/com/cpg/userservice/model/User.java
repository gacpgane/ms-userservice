package com.cpg.userservice.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "MOB_USERS")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name="LAST_NAME", nullable = false)
    private String lastName;

    @Column(name="EMAIL", nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ADDRESS_ID", referencedColumnName = "ID")
    private Address address;

}
