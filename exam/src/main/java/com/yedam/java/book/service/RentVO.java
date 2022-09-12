package com.yedam.java.book.service;

import lombok.Data;

@Data
public class RentVO {
	int bookNo;
	String bookName;
	int rentPrice; 
	int rentCnt;
}
