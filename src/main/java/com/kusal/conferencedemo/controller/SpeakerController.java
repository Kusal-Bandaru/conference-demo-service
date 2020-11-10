package com.kusal.conferencedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kusal.conferencedemo.model.Speaker;
import com.kusal.conferencedemo.repository.SpeakerRepository;

@RestController
@RequestMapping("api/v1/speakers")
public class SpeakerController {

	@Autowired
	SpeakerRepository speakerRepository;
	
	@GetMapping
	List<Speaker> getAll(){
		return speakerRepository.findAll();
	}
}
