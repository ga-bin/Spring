package com.yedam.java.board.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper mapper;
	@Override
	public int getBoardNo() {
		return mapper.getBoardNo();
	}

	@Override
	public int boardInsert(BoardVO boardVO) {
//		int result = mapper.insertBoard(boardVO);
//		String message = null;
//		if (result > 0) {
//			message = "success";
//		} else {
//			message = "fail";
//		}
//		return message;
		return mapper.insertBoard(boardVO);
	}

	@Override
	public List<BoardVO> getAllBoard() {
		return mapper.selectAllBoardList();
	}

}
