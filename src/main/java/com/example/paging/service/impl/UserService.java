package com.example.paging.service.impl;

import com.example.paging.model.user.User;
import com.example.paging.repository.UserRepositoryI;
import com.example.paging.service.UserServiceI;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements UserServiceI {
    private final UserRepositoryI userRepository;

    @Override
    public Page<User> findUsersByPage(int pageNumber, int pageSize) {
        Page<User> all = userRepository.findAll(PageRequest.of(pageNumber, pageSize));
        return all;
    }

}
