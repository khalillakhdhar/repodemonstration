package com.elite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
