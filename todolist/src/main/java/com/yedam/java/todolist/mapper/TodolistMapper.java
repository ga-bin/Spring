package com.yedam.java.todolist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.java.todolist.service.TodoVO;

@Mapper
public interface TodolistMapper {
	// 전체조회
	public List<TodoVO> getTodoList();

	// 추가
	public int insertTodo(TodoVO todoVO);
	
	// 추가시 no값 가져오기
	public int insertNo();

	// 삭제
	public int deleteTodo(int no);
	
	// 수정
	public int updateTodo(TodoVO todoVO);
}
