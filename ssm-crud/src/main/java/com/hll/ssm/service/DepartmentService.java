package com.hll.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hll.ssm.bean.Department;
import com.hll.ssm.dao.DepartmentMapper;

@Service
public class DepartmentService {
	@Autowired
	DepartmentMapper dm;
	
	public List<Department> getDepts(){
		List<Department> depts = null;
		try{
			depts = dm.selectByExample(null);
		}catch(Exception e){
			System.out.println("获取所有的部门信息出错");
		}
		
		return depts;
	}
}
