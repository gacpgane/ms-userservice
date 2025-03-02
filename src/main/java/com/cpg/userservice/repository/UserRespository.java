package com.cpg.userservice.repository;

import com.cpg.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
}
