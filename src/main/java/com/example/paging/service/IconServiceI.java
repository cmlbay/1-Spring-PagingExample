package com.example.paging.service;

import com.example.paging.model.Icons;

import java.util.List;

public interface IconServiceI {

    Long findTableSize();

    List<Icons> findIconsByPage(int pageNumber, int pageSize);


}
