package com.noel_maiego.board.repository;

import com.noel_maiego.board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
