package com.example.paging.service.impl;

import com.example.paging.model.Icons;
import com.example.paging.repository.IconRepositoryI;
import com.example.paging.service.IconServiceI;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IconService implements IconServiceI {

    private final IconRepositoryI iconRepository;

    @Override
    public Long findTableSize() {
        return iconRepository.count();
    }

    @Override
    public List<Icons> findIconsByPage(int pageNumber, int pageSize) {
        return iconRepository.findAll(PageRequest.of(pageNumber,pageSize)).getContent();
    }
}
