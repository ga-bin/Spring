package com.yedam.java.todolist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todolist.service.TodoVO;
import com.yedam.java.todolist.service.TodolistService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class TodolistController {
	
	@Autowired
	TodolistService service;
	
	@GetMapping("/todoList")
	public List<TodoVO> getTodoList() {
		return service.getTodoList();
	}
	
	
	@PostMapping("/todoList")
	public int insertTodo(TodoVO todoVO){
		todoVO.setNo(service.insertNo());
		return service.insertTodo(todoVO);
	}
	
	@DeleteMapping("/todoList/{no}")
	public int deleteTodo(@PathVariable int no) {
		return service.deleteTodo(no);
	}
	
	@PutMapping("/todoList")
	public int updateTodo(TodoVO todoVO) {
		return service.updateTodo(todoVO);
	}
}
