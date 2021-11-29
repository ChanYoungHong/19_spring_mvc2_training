<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bMain</title>
</head>

	<%--
	
		[ 실습 권장 사항 ]
	
		- 한번에 제대로 완성할 마음보다는 100번 만들어보겠다는 마음으로 여러번 반복해서 즐겁게 구현하세요.
		- 스프링을 공부하기에 어려움을 느끼는 기능들(페이징 구현 , 검색기능 구현 , 계층형 무한 댓글)이 모두 구현되어 있습니다.
		- 다양한 에러와 상황을 경험하고 어떤상황에 어떤 에러가 발생하는지 등등을 잘 정리하고 그 상황을 최대한 스스로 해결해보세요.
		 
	
		[ 구현 방안 ]
		
		- A안
		
		STEP 1. 먼저 순수한 CRUD 기능만 동작하도록 구현 (list,info,insert,update,delete)
		STEP 2. 검색 , 페이징기능 구현 
		STEP 3. 계층형 댓글 구현
		STEP 4. 부트스트랩 테마 디자인에 기능 복사하여 디자인 완성 
		
		
		- B안
		
		STEP 1. 계층형 댓글을 제외한 검색기능 , 페이징처리와 , 부트스트랩 , CRUD를 동시에 구현
		STEP 2. 계층형 댓글 구현
	
	
		- C안
		
		자신이 좋은 방법으로
	
	--%>

<body>
	<div align="center" style="padding-top: 100px">
		<img src="${contextPath }/resources/img/spring.png" alt="spring심볼" width="800px" height="500px"><br><br><br><br>
		<input type="button" value="게시판 보기" onclick="location.href='${contextPath }/boardAdvance/boardList'">
	</div>
</body>
</html>