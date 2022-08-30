<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%!static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
	static final String DBID = "root";
	static final String DBPW = "1234";%>    
<%
//String3.jsp
String id=request.getParameter("id");
// 1. 드라이버 로드
Class.forName(DRIVER);
// 2. 디비 연결
	  Connection con 
	      = DriverManager.getConnection(DBURL, DBID, DBPW);
// 3. SQL 작성(select) & pstmt 객체
	  String sql = "select * from itwill_member where id=?";
	  PreparedStatement pstmt = con.prepareStatement(sql);
	  // ???
	   pstmt.setString(1, id);
// 4. SQL 실행
ResultSet rs = pstmt.executeQuery();
// 5. 데이터처리	
String result="";
if(rs.next()){
	// 아이디 있음 => 아이디 중복
	result="아이디 중복";
}else{
	// 아이디 없음 => 아이디 사용가능
	result="아이디 사용가능";
}
%>
<%=result %>