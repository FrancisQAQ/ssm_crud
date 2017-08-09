package com.hll.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hll.ssm.bean.Department;
import com.hll.ssm.bean.Msg;
import com.hll.ssm.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService ds;
	
	@RequestMapping("/depts")
	@ResponseBody
	public Msg responseAllDepts(){
		List<Department> depts = ds.getDepts();
		Msg msg = new Msg().success().add("depts", depts);
		return msg;
	}
//	@RequestMapping("/depts")
//	@ResponseBody
//	public List<Department> responseAllDepts(){
//		List<Department> depts = ds.getDepts();
//		
//		return depts;
//	}
}
