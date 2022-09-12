package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;
import com.yedam.java.book.service.RentVO;



@Service
public class BookServiceimpl implements BookService{
	@Autowired
	BookMapper mapper;
	
	@Override
	public List<BookVO> getBookList() {
		return mapper.getBookList();
	}

	@Override
	public List<RentVO> getRentList() {
		return mapper.getRentList();
	}

	@Override
	public int insertBook(BookVO bookVO) {
		return mapper.insertBook(bookVO);
	}

	@Override
	public int newBookNum() {
		return mapper.newBookNum();
	}
}
