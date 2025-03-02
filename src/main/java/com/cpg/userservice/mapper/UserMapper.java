package com.cpg.userservice.mapper;

import com.cpg.userservice.dto.AddressDto;
import com.cpg.userservice.dto.UserDto;
import com.cpg.userservice.dto.UserResponse;
import com.cpg.userservice.model.Address;
import com.cpg.userservice.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        Address address = new Address();
        address.setCity(userDto.getAddress().getCity());
        address.setState(userDto.getAddress().getState());
        address.setStreet(userDto.getAddress().getStreet());
        address.setZip(userDto.getAddress().getZip());
        user.setAddress(address);
        return user;
    }

    public UserResponse toUserResponse(User user) {
        UserResponse userResponse = new UserResponse();
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        AddressDto addressDto = new AddressDto();
        addressDto.setCity(user.getAddress().getCity());
        addressDto.setState(user.getAddress().getState());
        addressDto.setStreet(user.getAddress().getStreet());
        addressDto.setZip(user.getAddress().getZip());
        userDto.setAddress(addressDto);
        userResponse.setUser(userDto);
        return userResponse;
    }


}
