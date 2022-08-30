<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//String2.jsp
// 'id':$('#id').val()
String id=request.getParameter("id");

String result="";

if(id.equals("kim")){
	result="아이디 중복";
}else{
	result="아이디 사용가능";
}
%>
<%=result %>
