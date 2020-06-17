package com.cos.mlb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.mlb.action.Action;
import com.cos.mlb.action.HomeAction;
import com.cos.mlb.action.PlayerInfoProcAction;
import com.cos.mlb.action.PlayerProcAction;

@WebServlet("/team")
public class TeamController extends HttpServlet {
	private final static String TAG = "TeamController";
	private static final long serialVersionUID = 1L;

	public TeamController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		System.out.println(TAG + "router:" + cmd);
		Action action = router(cmd);
		action.execute(request, response);

	}

	public Action router(String cmd) {
		if (cmd.equals("home")) {
			return new HomeAction();
		} else if (cmd.equals("playerProc")) {
			return new PlayerProcAction();
		} else if (cmd.equals("playerInfoProc")) {
			return new PlayerInfoProcAction();
		}

		return null;

	}
}