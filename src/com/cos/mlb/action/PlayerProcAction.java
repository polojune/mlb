package com.cos.mlb.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.mlb.repository.MlbRepository;
import com.google.gson.Gson;

public class PlayerProcAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                 String team = request.getParameter("team");
		             MlbRepository mlbRepository = MlbRepository.getInstance();
		             List<String> players  =  mlbRepository.playerList(team);
		             System.out.println("players:"+ players);
		             request.setAttribute("team", team);
		             
		             Gson gson = new Gson();
		             String playersbyteam = gson.toJson(players);
		             System.out.println("playersbyteam:"+ playersbyteam);
		             response.setCharacterEncoding("utf-8");
		             PrintWriter out = response.getWriter(); 
		             
		             out.print(playersbyteam);
	}
}
