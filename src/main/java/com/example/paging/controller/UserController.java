package com.example.paging.controller;

import com.example.paging.model.user.User;
import com.example.paging.model.user.UserPagingResponse;
import com.example.paging.service.UserServiceI;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/1.0/user")
public class UserController {

    private final UserServiceI userService;

    public UserController(UserServiceI userService){
        this.userService = userService;
    }

    @GetMapping("/find-by-page/{pageNumber}/{pageSize}")
    ResponseEntity<UserPagingResponse> findUserByPage(@PathVariable int pageNumber, @PathVariable int pageSize){
        Page<User> users = userService.findUsersByPage(pageNumber, pageSize);
        UserPagingResponse response = UserPagingResponse.builder()
                .users(users.getContent())
                .totalElements(users.getTotalElements())
                .build();
        return ResponseEntity.ok(response);
    }

}
