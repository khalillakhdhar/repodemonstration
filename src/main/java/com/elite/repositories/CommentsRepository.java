package com.elite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long> {

}
