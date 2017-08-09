package com.hll.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * 处理员工CRUD请求
 */
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hll.ssm.bean.Department;
import com.hll.ssm.bean.Employee;
import com.hll.ssm.bean.Msg;
import com.hll.ssm.service.DepartmentService;
import com.hll.ssm.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@Autowired
	DepartmentService ds;
	
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJSON(@RequestParam(value= "pn" ,defaultValue = "1")Integer pn){
		//查询的页数是第pn页，每页显示的记录是5条
				PageHelper.startPage(pn,5);
				//后面紧跟的查询便是一个分页查询
				List<Employee> employees = es.getAll();
				//5表示的是连续显示的页数
				PageInfo pageInfo = new PageInfo(employees,5);
				Msg result = new Msg().success().add("pageInfo", pageInfo);
				return result;
				
				
	}
	
	

	@RequestMapping(value="/emp",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveNewEmployee(@Valid Employee employee,BindingResult result){
		if(result.hasErrors()){
			Map<String,Object> errorMsg = new HashMap<String,Object>();
			List<FieldError> errors = result.getFieldErrors();
			for(FieldError error : errors){
				System.out.println("错误的字段名: " + error.getField());
				System.out.println("错误的信息: " + error.getDefaultMessage());
				errorMsg.put(error.getField(),error.getDefaultMessage());
			}
			return new Msg().fail().add("errorMsg", errorMsg);
		}else{
			es.saveEmp(employee);
			return new Msg().success();
		}
		
	}
	
	@RequestMapping(value="/judgeEmpName")
	@ResponseBody
	public Msg judgeEmpName(@RequestParam("empName")String empName){
		String val = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})";
		if(!empName.matches(val)){
			return Msg.fail().add("val_msg", "用户名格式错误，正确格式：6~16位字母、数字或者下划线，2~5位中文");
		}
		boolean result = es.judgeEmpName(empName);
		Msg msg;
		if(result){
			msg = new Msg().success();
		}else{
			msg = new Msg().fail().add("val_msg", "用户名已存在");
		}
		return msg;
	}
	
	
	@RequestMapping(value="/emp/{empId}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEmployeeById(@PathVariable("empId")Integer empId){
		Employee emp = es.getEmployeeById(empId);
		List<Department> depts = ds.getDepts();
		return new Msg().success().add("empData", emp).add("depts", depts);
	}
	
	@RequestMapping(value="/emp/{empId}",method=RequestMethod.PUT)
	@ResponseBody
	public Msg updateEmployee(Employee employee){
		es.updateEmployee(employee);
		return new Msg().success();
	}
	
	
	@RequestMapping(value="/emp/{empId}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteSimpleEmployee(@PathVariable("empId") Integer empId){
		System.out.println("要删除的员工ID：" + empId);
		es.deleteSimpleEmployee(empId);
		return new Msg().success();
	}
//	@RequestMapping("/test")
//	@ResponseBody
//	public Msg testSave(){
//		Employee e = new Employee();
//		e.setEmpName("Francis02");
//		Msg msg = new Msg();
//		try{
//			es.saveEmp(e);
//			msg = msg.success();
//		}catch (Exception ec){
//			ec.printStackTrace();
//			msg = msg.fail();
//		}finally{
//			return msg;
//		}
//		
//		
//	}
	
	@RequestMapping("/test")
	public void testSave(){
		Employee e = new Employee();
		e.setEmpName("Francis02");
		Msg msg = new Msg();
			es.saveEmp(e);
			
		
		
	}
}
