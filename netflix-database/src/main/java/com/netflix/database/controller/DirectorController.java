package com.netflix.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.database.entities.Title;
import com.netflix.database.service.TitleService;


@RestController
@RequestMapping("/api/director")
public class DirectorController {
	@Autowired
	TitleService titleService;
	@GetMapping("/{id}")
    public Title findById(@PathVariable int id){
        return titleService.findById(id);
    }

}
