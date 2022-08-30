<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
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
// json2.jsp
// 1. 드라이버 로드
Class.forName(DRIVER);
// 2. 디비 연결
	  Connection con 
	      = DriverManager.getConnection(DBURL, DBID, DBPW);
// 3. SQL 작성(select) & pstmt 객체
	  String sql = "select * from itwill_member";
	  PreparedStatement pstmt = con.prepareStatement(sql);
// 4. SQL 실행
ResultSet rs = pstmt.executeQuery();
// 5. 데이터처리	
// json-simple-1.1.1.jar 설치
// ArrayList 여러명의 회원정보를 저장
JSONArray memberList=new JSONArray();
while(rs.next()){
	// MemberBean 한사람의 정보저장
	JSONObject mb=new JSONObject();
	mb.put("id", rs.getString("id"));
	mb.put("name", rs.getString("name"));
	//한사람의 정보를 배열에 저장
	memberList.add(mb);
}
%>
<%=memberList%>