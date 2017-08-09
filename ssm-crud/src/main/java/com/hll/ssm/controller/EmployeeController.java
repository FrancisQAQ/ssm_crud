package com.hll.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * ����Ա��CRUD����
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
		//��ѯ��ҳ���ǵ�pnҳ��ÿҳ��ʾ�ļ�¼��5��
				PageHelper.startPage(pn,5);
				//��������Ĳ�ѯ����һ����ҳ��ѯ
				List<Employee> employees = es.getAll();
				//5��ʾ����������ʾ��ҳ��
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
				System.out.println("������ֶ���: " + error.getField());
				System.out.println("�������Ϣ: " + error.getDefaultMessage());
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
			return Msg.fail().add("val_msg", "�û�����ʽ������ȷ��ʽ��6~16λ��ĸ�����ֻ����»��ߣ�2~5λ����");
		}
		boolean result = es.judgeEmpName(empName);
		Msg msg;
		if(result){
			msg = new Msg().success();
		}else{
			msg = new Msg().fail().add("val_msg", "�û����Ѵ���");
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
		System.out.println("Ҫɾ����Ա��ID��" + empId);
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
