package com.kusal.conferencedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kusal.conferencedemo.model.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
