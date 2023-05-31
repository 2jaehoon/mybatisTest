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
     
      });
      </script>
</head>
<body>

<div>
<h2>
검색
</h2>


<table class="table">
<tr>
<th>이미지</th>
<th>제조국</th>
<th>모델명/제조사</th>
<th>년식</th>
<th>가격</th>
<th>옵션</th>
</tr>
<c:if test="${  empty makerList }">
<tr>
<td colspan="6"> <c:out value="${ param.car_option  }"/>이 검색되지 않습니다.</td>
</tr>
</c:if>
<c:forEach var="car" items="${ makerList  }">
<tr>
<td><img alt="" src="CAR/${ car.car_img  }" style="width: 80px"> </td>
<td><c:out value="${ car.country  }"/></td>
<td><c:out value="${ car.model  }/${ car.maker  }"/></td>
<td><c:out value="${ car.car_year  }"/></td>
<td><c:out value="${ car.price  }"/></td>
<td><c:out value="${ car.car_option  }"/></td>
</tr>
</c:forEach>

</table>
</div>






</body>
</html>