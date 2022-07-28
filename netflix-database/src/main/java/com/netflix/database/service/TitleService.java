package com.netflix.database.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.database.entities.Title;
import com.netflix.database.repositories.TitleRepository;

public class TitleService {

	@Autowired
	TitleRepository titleRepository;

	public Title findById(int id) {
		return titleRepository.findById(id).get();
	}

	public Title createTitle(Title region) {
		return titleRepository.save(region);
	}

	public void deleteTitle(int id) {
		titleRepository.deleteById(id);
	}

}
