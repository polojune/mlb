package com.cos.mlb.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.mlb.model.Mlb;
import com.cos.mlb.repository.MlbRepository;
import com.google.gson.Gson;

public class PlayerInfoProcAction implements Action{
       @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	             String player = request.getParameter("player");
    	             System.out.println("player:"+player);
    	             MlbRepository mlbRepository = MlbRepository.getInstance();
    	             Mlb playerInfo = mlbRepository.playerInfoList(player);
    	             System.out.println("playerInfo:" + playerInfo);
    	             request.setAttribute("player", player);
    	             
    	             Gson gson = new Gson(); 
    	             String playerToJson = gson.toJson(playerInfo);
    	             response.setCharacterEncoding("utf-8");
    	             PrintWriter out = response.getWriter();
    	             out.print(playerToJson);
    	             
    }
}
