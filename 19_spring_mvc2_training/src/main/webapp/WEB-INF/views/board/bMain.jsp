<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<%--

	[ 실습 순서 예시 ]

	
	1. web.xml에 한글 필터 설정
	2. POM.xml에 dependency 추가 
	
		- https://mvnrepository.com/ 에서 복사 혹은 구글링
	
		2-1) spring-jdbc 
		2-2) mysql-connector-java
		2-3) mybatis
		2-4) mybatis-spring 
	
	3. 데이터 베이스 및 테이블 생성
	4. root-context.xml파일에 DB연결정보 설정
	5. mybatis-config.xml파일 생성 및 Mapper 파일 생성

--%>

<body>
	<div align="center" style="padding-top: 100px">
		<img src="resources/img/spring.png" alt="spring심볼" width="800px" height="500px"><br><br><br><br>
		<input type="button" value="게시판 보기" onclick="location.href='boardList'">
	</div>
</body>
</html>