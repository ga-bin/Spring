package com.yedam.java.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
	// 도서목록조회
	public List<BookVO> getBookList();

	// 대여목록조회
	public List<RentVO> getRentList();

	// 도서 등록
	public int insertBook(BookVO bookVO);

	// 새로등록할 도서 번호
	public int newBookNum();
}
