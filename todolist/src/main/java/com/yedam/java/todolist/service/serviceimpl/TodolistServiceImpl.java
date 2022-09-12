package com.yedam.java.todolist.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todolist.mapper.TodolistMapper;
import com.yedam.java.todolist.service.TodoVO;
import com.yedam.java.todolist.service.TodolistService;

@Service
public class TodolistServiceImpl implements TodolistService {
	@Autowired
	TodolistMapper mapper;
	
	@Override
	public List<TodoVO> getTodoList() {
		return mapper.getTodoList();
	}

	@Override
	public int insertTodo(TodoVO todoVO) {
		return mapper.insertTodo(todoVO);
	}

	@Override
	public int insertNo() {
		return mapper.insertNo();
	}
	
	@Override
	public int deleteTodo(int no) {
		return mapper.deleteTodo(no);
	}

	@Override
	public int updateTodo(TodoVO todoVO) {
		return mapper.updateTodo(todoVO);
	}


}
