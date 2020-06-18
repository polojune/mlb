<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> -->
<script src = "/mlb/js/teamlist.js"> </script>
<script src = "/mlb/js/player.js"> </script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>MLB</title>
</head>

<body>
<div class = "container">
<div class="row">
<div class="col-sm-4">
	<h1>팀목록</h1>
	<table class="table table-striped">
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
                  <td> <a style="cursor:pointer" onclick="lists('${team}')">${team}</a></td> 
	           </tr>  
	    </c:forEach>		 
		</tbody>
	</table>
	</div>
  
  <div class="col-sm-3">
   <h1>선수목록</h1>
    <table  class="table table-striped">
         <thead> 
             <tr> 
               <th>번호</th>
               <th>선수이름</th>
             </tr>
         </thead>
         <tbody id="players"> 
<!--                <tr>   -->
<%--                  <td><a  style="cursor:pointer" onclick="playerinfo('${player}')">${player}</a></td> --%>
<!--                </tr>   -->
         </tbody>      
    </table>
    </div>
   	
   	<div class="col-sm-4">
   	<h1>선수정보</h1>
   	  <table class="table table-striped"> 
   	       <thead>
   	           <tr>
   	             <th>팀명</th>
   	             <th>선수이름</th>
   	             <th>포지션</th>
   	           </tr>
   	       </thead>
   	      
   	       <tbody id="playerinfo">
   	       
   	       </tbody>
   	             
   	  </table>
   	  </div>
   	  </div>
</div>
</body>

</html>