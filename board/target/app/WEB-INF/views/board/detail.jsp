<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
  
  $(function(){
    fnBoardEdit();
    fnBoardRemove();
    fnBoardList();
  })
  
  function fnBoardEdit(){
    $('#btnEdit').on('click', function(){
      location.href='${contextPath}/board/edit.do?boardNo=${board.boardNo}';
    })
  }
  
  function fnBoardRemove(){
    $('#btnRemove').on('click', function(){
      if(confirm('삭제할까요?')){
        location.href='${contextPath}/board/remove.do?boardNo=${board.boardNo}';
      }
    })
  }
  
  function fnBoardList(){
    $('#btnList').on('click', function(){
      location.href='${contextPath}/board/list.do';
    })
  }
  
</script>
</head>
<body>

  게시글번호: ${board.boardNo}<br>
  작성자: ${board.writer}<br>
  작성일: ${board.createdAt}<br>
  수정일: ${board.modifiedAt}<br>
  제목: ${board.title}<br>
  내용
  ${board.contents}<br>
  
  <hr>
  
  <button type="button" id="btnEdit">편집</button>
  <button type="button" id="btnRemove">삭제</button>
  <button type="button" id="btnList">목록</button>
  
</body>
</html>