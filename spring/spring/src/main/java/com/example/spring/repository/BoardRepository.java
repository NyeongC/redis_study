package com.example.spring.repository;

import com.example.spring.domain.Board;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BoardRepository extends JpaRepository<Board, Long> {

     Page<Board> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
