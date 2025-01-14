package com.example.spring.controller;

import com.example.spring.domain.Board;
import com.example.spring.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping()
    List<Board> getBoards(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return boardService.getBoards(page, size);
    }



}
