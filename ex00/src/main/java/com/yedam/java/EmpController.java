package com.yedam.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// jsp페이지 만들기 가능
@Controller
public class EmpController {
	@Autowired
	EmpMapper empMapper;
	
	@GetMapping("/emp")
	public String emp(Model model, EmpVO empVO) {
		EmpVO fincVO = empMapper.getEmp(empVO);
		model.addAttribute("emp", fincVO);
		return "emp";
	}

}

