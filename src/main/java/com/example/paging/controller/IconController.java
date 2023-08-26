package com.example.paging.controller;

import com.example.paging.model.Icons;
import com.example.paging.service.IconServiceI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/1.0/icon")
public class IconController {

    private final IconServiceI iconService;

    public IconController(IconServiceI iconService){
        this.iconService = iconService;
    }

    @GetMapping("/find-by-page/{pageNumber}/{pageSize}")
    ResponseEntity<List<Icons>> findIconByPage(@PathVariable int pageNumber, @PathVariable int pageSize){
        List<Icons> iconsByPage = iconService.findIconsByPage(pageNumber, pageSize);
        return ResponseEntity.ok(iconsByPage);
    }
}
