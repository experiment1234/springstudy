<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

$(() => {
	fnRegisterStaff();	
})

const fnRegisterStaff = () =>{
	$('#btn_register').click() => {
		$.ajax({
			type : post,
			url  : '${contextPath}/add.do',
			data : $('#frm_register').seralize(),
			dataType : 'json',
			success : (resData) => {
				if(resData.addResult === 1){
					alert('사원 등록이 성공했습니다.');
					fnGetStaffList();
					fnInit();
				} else {
					alert('사원 등록이 실패했습니다.');
				}
			},
			error: (jqXHR)=> {
				if(jqXHR.responseJSON.addResult === 0){
					alert('사원 등록이 실패했습니다.');
				}
			}
		})
	}
}

</script>
<body>
  <div>
    <h1>사원등록</h1>
    <div>
      <form id="frm_register"></form></div>
    </div>


<hr>

<div>
  <h1>사원조회</h1>
  <div>
    <input type="text" name="query" id="query" placeholder="사원번호입력">
    <button type="button" id="btn_query">조회</button>
    <button type="button" id="btn_list">전체</button>
    </div>
  
  </div>
</body>
</html>