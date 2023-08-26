package com.example.paging.service;

import com.example.paging.model.user.User;
import org.springframework.data.domain.Page;

public interface UserServiceI {

    Page<User> findUsersByPage(int pageNumber, int pageSize);

}
