package com.yedam.java.todolist.service;

import lombok.Data;

@Data
public class TodoVO {
	int no; // 할일번호
	int id; // 고유번호 56
	String contents; // 할일내용
	int todoyn; // 완료여부 ( 미완료 : 0 / 완료 : 1 )
}
