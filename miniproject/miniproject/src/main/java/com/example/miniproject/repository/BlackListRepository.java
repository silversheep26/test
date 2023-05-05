package com.example.miniproject.repository;

import com.example.miniproject.entity.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BlackListRepository extends JpaRepository<BlackList, Long> {
    BlackList findByToken(String token);
}

