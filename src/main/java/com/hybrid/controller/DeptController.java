package com.hybrid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hybrid.model.Dept;
import com.hybrid.service.DeptService;

@Controller
public class DeptController {	//Servlet 역할과 비슷하다.
	
	@Autowired
	DeptService deptService;
	
	@RequestMapping(value="/dept/list")	//URL 설정
	@ResponseBody
	public List<Dept> getList() {
		
		return deptService.getList();
	}

}
