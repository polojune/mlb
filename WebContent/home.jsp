<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src = "/mlb/js/teamlist.js"> </script>
<meta charset="UTF-8">
<title>MLB</title>
</head>
<body>
	<h1>팀목록</h1>
	<table border="1">
		<thead>
			<tr>
			  <th>번호</th>
			  <th>팀명</th>
			</tr>
			
		</thead>
		<tbody>
	    <c:forEach var="team" items="${teamList}" varStatus="status"> 
	           <tr> 
                  <td>${status.index+1}</td>
                  <td> <a style="cursor:hand" href="" onclick="lists('${team}')">${team}</a></td> 
	           </tr>  
	    </c:forEach>		 
		</tbody>
	</table>
  
   <h1>선수목록</h1>
    <table  border="1">
         <thead> 
             <tr> 
               <th>번호</th>
               <th>선수이름</th>
             </tr>
         </thead>
         <tbody id="players">
                 
         </tbody>      
    </table>
   	
</body>
</html>