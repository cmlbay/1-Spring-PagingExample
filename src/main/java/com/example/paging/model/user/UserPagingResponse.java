package com.example.paging.model.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class UserPagingResponse {
    private List<User> users = new ArrayList<User>();
    private long totalElements;

}
