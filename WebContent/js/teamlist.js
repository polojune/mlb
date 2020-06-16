function lists(team){
	alert(team);
	var data = { 
			team : team 
			
	}
	
	$.ajax({
		type : "post", 
		url : "/mlb/team?cmd=playerProc", 
		data : JSON.stringify(data),
		contentType : "application/json; charset-utf-8", 
		dataType : "json"
		
	}).done({
		
		
		
	}).fail()
	
}