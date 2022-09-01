package com.yedam.java;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpMapperClient {
	@Autowired EmpMapper empMapper;
	
	@Test
	public void getEmp() {
		EmpVO vo = new EmpVO();
		vo.setEmployeeId("100");
		EmpVO emp = empMapper.getEmp(vo);
		System.out.println(emp.toString());
		
	}
}

