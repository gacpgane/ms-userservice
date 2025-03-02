package com.cpg.userservice.dto;

import lombok.Data;

@Data
public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
    private AddressDto address;

}
