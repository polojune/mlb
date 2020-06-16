package com.cos.mlb.action;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.mlb.repository.MlbRepository;

public class PlayerProcAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedReader br = request.getReader();
		StringBuffer sb = new StringBuffer();
		String input = null;

		while ((input = br.readLine()) != null) {
			sb.append(input);
		}
		System.out.println("input:"+sb.toString());
	}
}
