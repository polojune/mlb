function playerinfo(player) {
	$.ajax({
		type : "post",
		url : "/mlb/team?cmd=playerInfoProc",
		data : "player=" + player,
		contentType : "application/x-www-form-urlencoded; charset-utf-8",
		dataType : "json"

	}).done(function(result) {
		$("#playerinfo").empty();
		
		var trItem = "<tr>";
		trItem += `"<td> ${result.team} </td>"`;
		trItem += `"<td> ${result.player} </td>"`;
		trItem += `"<td> ${result.position} </td>"`;
		trItem += "</tr>";
		$("#playerinfo").append(trItem);
	  	
		
      
	}).fail(function(error) {
		console.log(error);

	});
}