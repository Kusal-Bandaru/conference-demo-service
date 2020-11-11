package com.kusal.conferencedemo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping
	@RequestMapping("{id}")
	public Speaker getSpeakerByID(@PathVariable long id) {
		return speakerRepository.getOne(id);
//		 return SpeakerRepository.findById(id).get();
	}
	
	@PostMapping
	@RequestMapping("/create")
	public Speaker createSpeaker(@RequestBody final Speaker speaker) {
		return speakerRepository.saveAndFlush(speaker);
	}
	
	@DeleteMapping
	@RequestMapping("delete/{id}")
	public void deleteSpeakerByID(@PathVariable final long id) {
		speakerRepository.deleteById(id);
	}
	
	@PutMapping
	@RequestMapping("/update")
	public Speaker updateSpeaker(@RequestBody final Speaker speaker) {
		Speaker existingSpeaker = speakerRepository.getOne(speaker.getId());
		BeanUtils.copyProperties(speaker, existingSpeaker, "id");
		return speakerRepository.saveAndFlush(existingSpeaker);
	}
}
