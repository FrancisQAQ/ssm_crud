package com.hll.ssm.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.hll.ssm.bean.Employee;

/**
 * ʹ��Spring����ģ��
 * @author huang
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springDispatcherServlet.xml"})
public class MVCTest {
	
	@Autowired
	WebApplicationContext context;
	//����mvc���󣬻�ȡ���������
	MockMvc mockMvc;
	
	@Before
	public void initMockMoc(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testPage() throws Exception{
		//ģ�������õ�����ֵ
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "2")).andReturn();
		
		//����ɹ��Ժ��������л���pageInfo�����ǿ���ȡ��pageInfo������֤
		MockHttpServletRequest request = result.getRequest();
		PageInfo<Employee> pageInfo = (PageInfo<Employee>) request.getAttribute("pageInfo");
		System.out.println("��ǰҳ�룺" + pageInfo.getPageNum());
		System.out.println("��ҳ�룺" + pageInfo.getPages());
		System.out.println("�ܼ�¼����" + pageInfo.getTotal());
		System.out.println("��ҳ����Ҫ������ʾ��ҳ��");
		int[] nums = pageInfo.getNavigatepageNums();
		for(int i : nums){
			System.out.print("  " + i);
		}
		System.out.println();
		//��ȡԱ������
		List<Employee> emps = pageInfo.getList();
		for(Employee emp : emps){
			System.out.println("ID: " + emp.getEmpId()+"==>Name:"+emp.getEmpName());
		}
	}
}