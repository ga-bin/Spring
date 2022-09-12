package com.yedam.java.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	// home페이지로 이동
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	// bookList페이지로 이동
	@GetMapping("/bookList")
	public String bookListForm(Model model) {
		model.addAttribute("list", service.getBookList());
		return "book/bookListForm";
	}
	
	// rentList페이지로 이동
	@GetMapping("/rentList")
	public String rentListForm(Model model) {
		model.addAttribute("list", service.getRentList());
		return "book/rentListForm";
	}
	
	// insert페이지로 이동
	@GetMapping("/insert")
	public String insertForm(Model model) {
		model.addAttribute("bookNo", service.newBookNum());
		return "book/insertForm";
	}
	
	// insert로직처리
	@PostMapping("/insert")
	public String insert(BookVO bookVO) {
		service.insertBook(bookVO);
		return "redirect:home";
	}
	
}
