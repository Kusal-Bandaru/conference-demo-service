package com.kusal.conferencedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kusal.conferencedemo.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{

}
