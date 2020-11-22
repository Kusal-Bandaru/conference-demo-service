package com.kusal.conferencedemo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kusal.conferencedemo.model.Session;
import com.kusal.conferencedemo.repository.SessionRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

	@Autowired
	SessionRepository sessionRepository;

	@GetMapping
	public List<Session> getAll() {
		return sessionRepository.findAll();
	}

	@GetMapping
	@RequestMapping("{id}")
	public Session getSessionByID(@PathVariable long id) {
		return sessionRepository.getOne(id);
//		 return sessionRepository.findById(id).get();
	}
	
	@PostMapping
	@RequestMapping("/create")
	public Session createSession(@RequestBody final Session session) {
		return sessionRepository.saveAndFlush(session);
	}
	
	@DeleteMapping
	@RequestMapping("delete/{id}")
	public void deleteSessionByID(@PathVariable final long id) {
		sessionRepository.deleteById(id);
	}
	
	@PutMapping
	@RequestMapping("/update")
	public Session updateSession(@RequestBody final Session session) {
		Session existingSession = sessionRepository.getOne(session.getId());
		BeanUtils.copyProperties(session, existingSession, "id");
		return sessionRepository.saveAndFlush(existingSession);
	}
}
