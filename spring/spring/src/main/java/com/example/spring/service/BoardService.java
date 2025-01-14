package com.example.spring.service;

import com.example.spring.domain.Board;
import com.example.spring.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getBoards(int page, int size) {

        Pageable pageable = PageRequest.of(page - 1, size);

        Page<Board> pageOfBoards =  boardRepository.findAllByOrderByCreatedAtDesc(pageable);

        return pageOfBoards.getContent();
    }

}
