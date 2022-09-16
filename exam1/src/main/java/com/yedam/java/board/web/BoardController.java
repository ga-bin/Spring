package com.yedam.java.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService service;
	
	// 게시글 목록
	@GetMapping("/list")
	public String insertForm(Model model) {
		model.addAttribute("boardList", service.getAllBoard());
		return "board/list";
	}
	
	
	
}
