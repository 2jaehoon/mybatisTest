<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap 시작-->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous"/>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
      <!-- bootstrap 끝-->
      <!-- jQuery CDN 시작 -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
     <!-- jQuery CDN 끝 -->
      <script type="text/javascript">
      $(function(){
     
    	  $("#btn").click(function(){
    		  /* alert($("[name='maker']:checked").length); */
    		  
    		   if( $("[name='maker']:checked").length<1 ){
    			  alert("제조사는 하나 이상 선택해주세요.");
    			  return;
    		  }//end if 
    		  
    		   $("#frm").submit(); 
    	  });
      });
      </script>
</head>
<body>

<div>
<h2>제조사 검색</h2><br>
<form action="search_model.do" method="get" id="frm" name="frm">
<c:if test="${ empty maker }">
제조사가 검색되지 않습니다.
</c:if>
<c:forEach var="maker" items="${ maker  }">
<input type="checkbox" name="maker" value="${  maker }"/>
<c:out value="${  maker }"></c:out>
</c:forEach>
<br>
<input type="button" value="제조사 선택" class="btn btn-success" id="btn"/>
</form>
</div>






</body>
</html>