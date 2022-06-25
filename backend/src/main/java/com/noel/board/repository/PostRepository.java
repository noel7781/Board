package com.noel.board.repository;

import com.noel.board.entity.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    static final Logger logger = LoggerFactory.getLogger(PostRepository.class);
}
