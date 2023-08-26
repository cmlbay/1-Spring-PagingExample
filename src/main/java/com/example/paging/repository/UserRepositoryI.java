package com.example.paging.repository;

import com.example.paging.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryI extends JpaRepository<User,Long> {

    Long countBySurname(String surname);

    Long countByName(String name);
}
