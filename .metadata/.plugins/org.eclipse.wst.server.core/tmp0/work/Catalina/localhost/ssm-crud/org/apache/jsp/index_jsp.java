/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2017-07-30 14:44:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>员工列表</title>\r\n");
 pageContext.setAttribute("APP_PATH", request.getContextPath());
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- \t员工编辑 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"emp_edit_modal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"myModalLabel\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">修改员工信息</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" id=\"emp_edit_form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">lastName</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"form-control-static\" id=\"empName_edit_p\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">email</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"empEmail\" id=\"empEmail_edit_input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"empEmail@qq.com\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"help-block\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">gender</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"empGender\" id=\"genderM\" value=\"M\" checked=\"checked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t男\r\n");
      out.write("\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"empGender\" id=\"genderF\" value=\"F\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t女\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">department</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"dept_edit_select\" name=\"dId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"emp_edit_modal_save\">保存修改</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \t员工添加 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"emp_add_modal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"myModalLabel\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">添加新员工</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" id=\"emp_add_form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">lastName</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"empName\" id=\"empName_add_input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"empName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"help-block\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">email</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"empEmail\" id=\"empEmail_add_input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"empEmail@qq.com\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"help-block\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">gender</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"empGender\" id=\"genderM\" value=\"M\" checked=\"checked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t男\r\n");
      out.write("\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"empGender\" id=\"genderF\" value=\"F\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t女\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">department</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"dept_add_select\" name=\"dId\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"emp_add_modal_save\">保存</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- 标题 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<h1>SSM-CRUD</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 新增删除栏 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-8\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary \" id=\"emp_add\">新增</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-danger \" id=\"emp_delete\">删除</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 数据 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<table class=\"table table-hover\" id=\"emps_table\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th><input type=\"checkbox\" class=\"check_all\"/></th>\r\n");
      out.write("\t\t\t\t\t\t<th>#</th>\r\n");
      out.write("\t\t\t\t\t\t<th>lastName</th>\r\n");
      out.write("\t\t\t\t\t\t<th>gender</th>\r\n");
      out.write("\t\t\t\t\t\t<th>email</th>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<th>deptName</th>\r\n");
      out.write("\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 分页栏 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6\" id=\"recordInfo\"></div>\r\n");
      out.write("\t\t\t<!--//查询到的记录信息 -->\r\n");
      out.write("\t\t\t<div class=\"col-md-6\" id=\"splitArea\">\r\n");
      out.write("\t\t\t\t<nav aria-label=\"Page navigation\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"pagination\" id=\"pagination\">\r\n");
      out.write("<!-- \t\t\t\t\t\t<li><a href=\"#\" aria-label=\"Previous\"> <span -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\taria-hidden=\"true\">&laquo;</span> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t<li><a href=\"#\">1</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t<li><a href=\"#\">2</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t<li><a href=\"#\">3</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t<li><a href=\"#\">4</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t<li><a href=\"#\">5</a></li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t<li><a href=\"#\" aria-label=\"Next\"> <span -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\taria-hidden=\"true\">&raquo;</span> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t</a></li> -->\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar totalRecord,currPage;\r\n");
      out.write("\t\tvar currDept;\r\n");
      out.write("\t\t//1.页面加载完毕之后直接发送ajax请求，要到分页数据\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tto_page(1);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction to_page(pn){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emps\",\r\n");
      out.write("\t\t\t\tdata:\"pn=\" + pn,\r\n");
      out.write("\t\t\t\ttype: \"GET\",\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\ttotalRecord = result.extend.pageInfo.total;\r\n");
      out.write("\t\t\t\t\tcurrPage = result.extend.pageInfo.pageNum;\r\n");
      out.write("\t\t\t\t\t//console.log(result);\r\n");
      out.write("\t\t\t\t\t//1.解析并显示员工数据\r\n");
      out.write("\t\t\t\t\tbuild_emps_table(result);\r\n");
      out.write("\t\t\t\t\t//2.解析并显示分页数据\r\n");
      out.write("\t\t\t\t\tbuild_emps_page(result);\r\n");
      out.write("\t\t\t\t\t//3.解析并显示分页栏数据\r\n");
      out.write("\t\t\t\t\tbuild_emps_pagination(result);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction build_emps_table(result){\r\n");
      out.write("\t\t\t$(\"#emps_table tbody\").empty();\r\n");
      out.write("\t\t\tvar emps = result.extend.pageInfo.list;\r\n");
      out.write("\t\t\t$.each(emps,function(index,emp){\r\n");
      out.write("\t\t\t\tvar empCheck = $(\"<td></td>\").append(\"<input type=\\\"checkbox\\\" class=\\\"empCheck\\\"/>\")\r\n");
      out.write("\t\t\t\tvar empId = $(\"<td></td>\").append(emp.empId);\r\n");
      out.write("\t\t\t\tvar empName = $(\"<td></td>\").append(emp.empName);\r\n");
      out.write("\t\t\t\tvar empGender = $(\"<td></td>\").append((emp.empGender == \"M\" ? \"男\" : \"女\"));\r\n");
      out.write("\t\t\t\tvar empEmail = $(\"<td></td>\").append(emp.empEmail);\r\n");
      out.write("\t\t\t\tvar deptName = $(\"<td></td>\").append(emp.dept.deptName);\r\n");
      out.write("\t\t\t\tvar operation = $(\"<td></td>\");\r\n");
      out.write("\t\t\t\t/**\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>编辑\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-danger btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span>删除\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t*/\r\n");
      out.write("\t\t\t\tvar button_edit = $(\"<button></button>\").addClass(\"btn btn-primary btn-sm emp_edit\").append($(\"<span></span>\").addClass(\"glyphicon glyphicon-pencil\")).append(\"编辑\").attr(\"emp_id\",emp.empId);\r\n");
      out.write("\t\t\t\tvar button_delete = $(\"<button></button>\").addClass(\"btn btn-danger btn-sm emp_delete\").append($(\"<span></span>\").addClass(\"glyphicon glyphicon-trash\")).append(\"删除\").attr(\"emp_id\",emp.empId);\r\n");
      out.write("\t\t\t\toperation.append(button_edit).append(\" \").append(button_delete);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"<tr></tr>\").append(empCheck)\r\n");
      out.write("\t\t\t\t.append(empId)\r\n");
      out.write("\t\t\t\t.append(empName)\r\n");
      out.write("\t\t\t\t.append(empGender)\r\n");
      out.write("\t\t\t\t.append(empEmail)\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t.append(deptName)\r\n");
      out.write("\t\t\t\t.append(operation)\r\n");
      out.write("\t\t\t\t.appendTo(\"#emps_table tbody\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction build_emps_page(result){\r\n");
      out.write("\t\t\t$(\"#recordInfo\").empty();\r\n");
      out.write("\t\t\tvar pageInfo = result.extend.pageInfo;\r\n");
      out.write("\t\t\tvar recordInfo = $(\"#recordInfo\");\r\n");
      out.write("\t\t\trecordInfo.append(\"当前第 \" + pageInfo.pageNum + \" 页\")\r\n");
      out.write("\t\t\t.append(\"，共有 \" + pageInfo.pages + \" 页\")\r\n");
      out.write("\t\t\t.append(\",总计 \" + pageInfo.total + \" 条记录\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction build_emps_pagination(result){\r\n");
      out.write("\t\t\t$(\"#pagination\").empty();\r\n");
      out.write("\t\t\tvar navigatepageNums = result.extend.pageInfo.navigatepageNums;\r\n");
      out.write("\t\t\tvar pagination = $(\"#pagination\");\r\n");
      out.write("\t\t\tvar firstPage = $(\"<li></li>\").append($(\"<a></a>\").attr(\"href\",\"#\").append(\"首页\"));\r\n");
      out.write("\t\t\tvar previousPage = $(\"<li></li>\")\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t$(\"<a></a>\").attr(\"href\",\"#\").attr(\"aria-label\",\"Previous\")\r\n");
      out.write("\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<span></span>\").attr(\"aria-hidden\",\"true\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.append(\"&laquo;\")\r\n");
      out.write("\t\t\t\t\t   \t\t   )\r\n");
      out.write("\t\t\t\t   );\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(result.extend.pageInfo.hasPreviousPage == false){\r\n");
      out.write("\t\t\t\tfirstPage.addClass(\"disabled\");\r\n");
      out.write("\t\t\t\tpreviousPage.addClass(\"disabled\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tfirstPage.click(\r\n");
      out.write("\t\t\t\t\t\tfunction(){\r\n");
      out.write("\t\t\t\t\t\t\tto_page(1);\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\tpreviousPage.click(function(){\r\n");
      out.write("\t\t\t\t\tto_page(result.extend.pageInfo.pageNum - 1);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tpagination.append(firstPage).append(previousPage);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.each( navigatepageNums, function(i, temp){\r\n");
      out.write("\t\t\t\tvar midPage = $(\"<li></li>\").append($(\"<a></a>\").attr(\"href\",\"#\").append(temp));\r\n");
      out.write("\t\t\t\tif(temp == result.extend.pageInfo.pageNum){\r\n");
      out.write("\t\t\t\t\tmidPage.addClass(\"active\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tpagination.append(midPage);\r\n");
      out.write("\t\t\t\tmidPage.click(function(){\r\n");
      out.write("\t\t\t\t\tto_page(temp);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar nextPage = $(\"<li></li>\")\r\n");
      out.write("\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t$(\"<a></a>\").attr(\"href\",\"#\").attr(\"aria-label\",\"Previous\")\r\n");
      out.write("\t\t\t\t\t\t.append(\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"<span></span>\").attr(\"aria-hidden\",\"true\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.append(\"&raquo;\")\r\n");
      out.write("\t\t\t\t\t   \t\t   )\r\n");
      out.write("\t\t\t\t   );\t\t\r\n");
      out.write("\t\t\tvar lastPage = $(\"<li></li>\").append($(\"<a></a>\").attr(\"href\",\"#\").append(\"末页\"));\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(result.extend.pageInfo.hasNextPage == false){\r\n");
      out.write("\t\t\t\tnextPage.addClass(\"disabled\");\r\n");
      out.write("\t\t\t\tlastPage.addClass(\"disabled\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tnextPage.click(\r\n");
      out.write("\t\t\t\t\t\tfunction(){\r\n");
      out.write("\t\t\t\t\t\t\tto_page(result.extend.pageInfo.pageNum + 1);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t\t\t\tlastPage.click(\r\n");
      out.write("\t\t\t\t\t\tfunction(){\r\n");
      out.write("\t\t\t\t\t\t\tto_page(result.extend.pageInfo.pages);\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tpagination.append(nextPage).append(lastPage);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#emp_add\").click(function(){\r\n");
      out.write("\t\t\t$(\"#emp_add_modal form\")[0].reset();\r\n");
      out.write("\t\t\t$(\"#empName_add_input\").parent().removeClass(\"has-success has-error\");\r\n");
      out.write("\t\t\t$(\"#empName_add_input\").next(\"span\").text(\"\");\r\n");
      out.write("\t\t\t$(\"#empEmail_add_input\").parent().removeClass(\"has-success has-error\");\r\n");
      out.write("\t\t\t$(\"#empEmail_add_input\").next(\"span\").text(\"\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//弹出模态框\r\n");
      out.write("\t\t\t$(\"#emp_add_modal\").modal(\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tbackdrop : \"static\"\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t);\r\n");
      out.write("\t\t\tgetDepts(\"#dept_add_select\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//查询出下拉列表的部门信息\r\n");
      out.write("\t\tfunction getDepts(ele){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype: \"GET\",\r\n");
      out.write("\t\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/depts\",\r\n");
      out.write("\t\t\t\tsuccess: function(result){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar depts = result.extend.depts;\r\n");
      out.write("\t\t\t\t\t$(ele).empty();\r\n");
      out.write("\t\t\t\t\t$(ele).append($(\"<option></option>\").attr(\"value\",10).append(\"待显示页面\"));\r\n");
      out.write("\t\t\t\t\t$.each(depts,function(index,dept){\r\n");
      out.write("\t\t\t\t\t\tif(dept.deptId == currDept){\r\n");
      out.write("\t\t\t\t\t\t\t$(ele).append($(\"<option></option>\").attr(\"selected\",true).attr(\"value\",dept.deptId).append(dept.deptName));\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$(ele).append($(\"<option></option>\").attr(\"value\",dept.deptId).append(dept.deptName));\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t//currDept = 0;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#empName_add_input\").change(function(){\r\n");
      out.write("\t\t\talert(\"empName=\" + this.value);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"GET\",\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/judgeEmpName\",\r\n");
      out.write("\t\t\t\tdata:\"empName=\" + this.value,\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\tvar reason = result.reason;\r\n");
      out.write("\t\t\t\t\tif(reason == \"处理成功\"){\r\n");
      out.write("\t\t\t\t\t\tshow_validate_msg(\"#empName_add_input\",\"success\",\"\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#emp_add\").attr(\"ajax-va\",\"success\");\r\n");
      out.write("\t\t\t\t\t}else if(reason == \"处理失败\"){\r\n");
      out.write("\t\t\t\t\t\tshow_validate_msg(\"#empName_add_input\",\"error\",result.extend.val_msg);\r\n");
      out.write("\t\t\t\t\t\t$(\"#emp_add\").attr(\"ajax-va\",\"error\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//保存新员工信息\r\n");
      out.write("\t\t$(\"#emp_add_modal_save\").click(function(){\r\n");
      out.write("\t\t\t//1.首先校验一下员工信息格式是否正确\r\n");
      out.write("\t\t\tif(!validateEmpInfo()){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif($(\"#emp_add\").attr(\"ajax-va\") == \"error\"){\r\n");
      out.write("\t\t\t\tshow_validate_msg(\"#empName_add_input\",\"error\",\"用户名已存在\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//2.发送增加员工的ajax请求\r\n");
      out.write("\t\t\tsaveEmp();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction validateEmpInfo(){\r\n");
      out.write(" \t\t\tvar empName = $(\"#empName_add_input\").val();\r\n");
      out.write(" \t\t\tvar regEmpName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})/;\r\n");
      out.write(" \t\t\tif(!regEmpName.test(empName)){\r\n");
      out.write(" \t\t\t\tshow_validate_msg(\"#empName_add_input\",\"error\",\"用户名格式错误，正确格式：6~16位字母、数字或者下划线，2~5位中文\");\r\n");
      out.write(" \t\t\t\treturn false;\r\n");
      out.write(" \t\t\t}else {\r\n");
      out.write(" \t\t\t\tshow_validate_msg(\"#empName_add_input\",\"success\",\"\");\r\n");
      out.write(" \t\t\t\t\r\n");
      out.write(" \t\t\t}\t\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\tvar empEmail = $(\"#empEmail_add_input\").val();\r\n");
      out.write("\t \t\tvar regEmpEmail = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\r\n");
      out.write("\t \t\tif(!regEmpEmail.test(empEmail)){\r\n");
      out.write("\t \t\t\tshow_validate_msg(\"#empEmail_add_input\",\"error\",\"邮箱格式不正确\");\r\n");
      out.write("\t \t\t\t//alert(\"邮箱格式不正确\");\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}else{\r\n");
      out.write("\t \t\t\tshow_validate_msg(\"#empEmail_add_input\",\"success\",\"\");\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction show_validate_msg(column,status,msg){\r\n");
      out.write("\t\t\t$(column).parent().removeClass(\"has-success has-error\");\r\n");
      out.write("\t\t\t$(column).next(\"span\").text(\"\");\r\n");
      out.write("\t\t\tif(status == \"success\"){\r\n");
      out.write("\t\t\t\t$(column).parent().addClass(\"has-success\");\r\n");
      out.write("\t\t\t\t$(column).next(\"span\").text(msg);\r\n");
      out.write("\t\t\t}else if(status = \"error\"){\r\n");
      out.write("\t\t\t\t$(column).parent().addClass(\"has-error\");\r\n");
      out.write("\t\t\t\t$(column).next(\"span\").text(msg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction saveEmp(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp\",\r\n");
      out.write("\t\t\t\tdata:$(\"#emp_add_form\").serialize(),\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(result.reason == \"处理失败\"){\r\n");
      out.write("\t\t\t\t\t\tif(result.extend.errorMsg.empName != undefined){\r\n");
      out.write("\t\t\t\t\t\t\tshow_validate_msg(\"#empName_add_input\",\"error\",result.extend.errorMsg.empName);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(result.extend.errorMsg.empEmail != undefined){\r\n");
      out.write("\t\t\t\t\t\t\tshow_validate_msg(\"#empEmail_add_input\",\"error\",result.extend.errorMsg.empEmail);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\t\t}else {\r\n");
      out.write("\t\t\t\t\t\t$(\"#emp_add_modal\").modal('hide');\r\n");
      out.write("\t\t\t\t\t\tto_page(totalRecord);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t//alert(result.reason);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//1.绑定click事件是在编辑元素创建出来之前进行的，所以无法成功\r\n");
      out.write("\t\t//2.Jquery新版本去掉了live方法，用on方法替代\r\n");
      out.write("\t\t$(document).on(\"click\",\".emp_edit\",function(){\r\n");
      out.write("\t\t\t$(\"#emp_edit_modal_save\").attr(\"emp_id\",$(this).attr(\"emp_id\"));\r\n");
      out.write("\t\t\t//1.获取员工信息并填充到编辑员工模态框中\r\n");
      out.write("\t\t\tgetEmpData($(this).attr(\"emp_id\"));\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//2.显示模态框\r\n");
      out.write("\t\t\t$(\"#emp_edit_modal\").modal(\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tbackdrop : \"static\"\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction getEmpData(empId){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"GET\",\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\" + empId,\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\tvar empData = result.extend.empData;\r\n");
      out.write("\t\t\t\t\t$(\"#empName_edit_p\").text(empData.empName);\r\n");
      out.write("\t\t\t\t\t$(\"#empEmail_edit_input\").val(empData.empEmail);\r\n");
      out.write("\t\t\t\t\t$(\"#emp_edit_modal input[name=empGender]\").val([empData.empGender]);\r\n");
      out.write("\t\t\t\t\t//currDept = empData.dId;\r\n");
      out.write("\t\t\t\t\t//alert(\".dept_edit_select\").val();\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t            var depts = result.extend.depts;\r\n");
      out.write("\t\t\t\t\t$(dept_edit_select).empty();\r\n");
      out.write("\t\t\t\t\t$(dept_edit_select).append($(\"<option></option>\").attr(\"value\",10).append(\"待显示页面\"));\r\n");
      out.write("// \t\t\t\t\talert(\"dept.deptId:\" + dept.deptId);\r\n");
      out.write("// \t\t\t\t\talert(\"empData.dId:\" + empData.dId);\r\n");
      out.write("\t\t\t\t\t$.each(depts,function(index,dept){\r\n");
      out.write("\t\t\t\t\t\tif(dept.deptId == empData.dId){\r\n");
      out.write("\t\t\t\t\t\t\t$(dept_edit_select).append($(\"<option></option>\").attr(\"selected\",true).attr(\"value\",dept.deptId).append(dept.deptName));\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$(dept_edit_select).append($(\"<option></option>\").attr(\"value\",dept.deptId).append(dept.deptName));\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("// \t\t\t\t\t$(\".dept_edit_select\").find(\"option[value=2]\").attr(\"selected\",true);\r\n");
      out.write("\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#emp_edit_modal_save\").click(function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"PUT\",\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\" + $(this).attr(\"emp_id\"),\r\n");
      out.write("\t\t\t\tdata:$(\"#emp_edit_form\").serialize(),\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\t$(\"#emp_edit_modal\").modal(\"hide\");\r\n");
      out.write("\t\t\t\t\tto_page(currPage);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tconsole.log($(\"#emp_edit_form\").serialize());\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).on(\"click\",\".emp_delete\",function(){\r\n");
      out.write("\t\t\tvar empName = $(this).parents(\"tr\").find(\"td:eq(2)\").text();\r\n");
      out.write("\t\t\tvar empId = $(this).attr(\"emp_id\");\r\n");
      out.write("\t\t\tif(confirm(\"确认删除【\" + empName + \"】吗？\")){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype:\"DELETE\",\r\n");
      out.write("\t\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\" + empId,\r\n");
      out.write("\t\t\t\t\tsuccess:function(success){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(success);\r\n");
      out.write("\t\t\t\t\t\tto_page(currPage);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//全选选定按钮点击时间\r\n");
      out.write("\t\t$(\".check_all\").click(function(){\r\n");
      out.write("\t\t\t$(\".empCheck\").prop(\"checked\",$(this).prop(\"checked\"));\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).on(\"click\",\".empCheck\",function(){\r\n");
      out.write("\t\t\tvar flag = $(\".empCheck:checked\").length == $(\".empCheck\").length;\r\n");
      out.write("\t\t\t\t$(\".check_all\").prop(\"checked\",flag);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
