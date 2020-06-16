package com.cos.mlb.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.mlb.repository.MlbRepository;

public class HomeAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MlbRepository mlbRepository = MlbRepository.getInstance();

		List<String> teamList = mlbRepository.findList();
		request.setAttribute("teamList", teamList);

		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);

	}
}
