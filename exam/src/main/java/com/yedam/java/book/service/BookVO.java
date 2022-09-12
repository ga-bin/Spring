package com.yedam.java.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	int bookNo;
	String bookName;
	String bookCoverImg;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	Date date;
	int bookPrice;
	String bookPublisher;
	String bookInfo;
	
}
