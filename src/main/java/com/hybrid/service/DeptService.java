package com.hybrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hybrid.mapper.DeptMapper;
import com.hybrid.model.Dept;

@Service	//이 Bean을 자동으로 등록
public class DeptService {
	
	//field 주입
	@Autowired	//아래의 타입이 있으면 자동으로 injection.
	DeptMapper deptMapper;
	
	@Transactional //Transaction을 시작.
	public List<Dept> getList() {
		
		deptMapper.selectAll();
		
		List<Dept> depts = deptMapper.selectAll();
		
		return depts;
	}
	
}
