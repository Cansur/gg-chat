package gg.together.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gg.together.chat.domain.Board;
import gg.together.chat.repository.BoardRepository;

@Service
public class BoardService {
    
    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getAllUser(){
        return boardRepository.findAll();
    }
}
