<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <c:forEach items="${l }" var="n" varStatus="q">
        <input type="radio" class="select" name="mobileInt" value="${n.mobileInt }"><span>${n.mobileInt }</span>
      <c:if test="${q.count%4==0 }" > <br/></c:if>
      </c:forEach>
 
</body>
</html>