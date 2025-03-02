package com.cpg.userservice.service;

import com.cpg.userservice.dto.UserDto;
import com.cpg.userservice.dto.UserResponse;
import com.cpg.userservice.exception.UserNotFoundException;
import com.cpg.userservice.mapper.UserMapper;
import com.cpg.userservice.model.User;
import com.cpg.userservice.repository.UserRespository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public UserResponse createUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        user = userRespository.save(user);
        UserResponse userResponse = userMapper.toUserResponse(user);
        userResponse.setMessage("User Created");
        return userResponse;
    }

    public UserResponse getUser(Long id) {
        User user = userRespository.findById(id).orElseThrow(() -> new UserNotFoundException(id.toString()));
        UserResponse userResponse = userMapper.toUserResponse(user);
        userResponse.setMessage("User Found");
        return userResponse;
    }

}
