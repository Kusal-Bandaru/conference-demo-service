package com.kusal.conferencedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kusal.conferencedemo.model.Session;
import com.kusal.conferencedemo.repository.SessionRepository;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

	@Autowired
	SessionRepository sessionRepository;
	
	@GetMapping
	public List<Session> getAll(){
		return sessionRepository.findAll();
	}
}
