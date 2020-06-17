function lists(team){
	$.ajax({
		type : "post", 
		url : "/mlb/team?cmd=playerProc", 
		data : "team="+team,
		contentType : "application/x-www-form-urlencoded; charset-utf-8", 
		dataType : "json"
		
	}).done(function(result){
		  var i = 1;
		  $("#players").empty();
		  $("#playerinfo").empty();
		  for(var name of result){
			     var trItem = "<tr>";
			         trItem += "<td>"+ i++ + "</td>";
			    	 trItem +=` <td><a style="cursor:pointer" onclick="playerinfo('${name}')">${name}</a></td>`;
			         trItem +="</tr>";
			   	  $("#players").append(trItem);
			   	 
			   	  trItem="";
			         
		  }
		
		
	}).fail(function(error) {
		console.log(error);
	
		
	});
}