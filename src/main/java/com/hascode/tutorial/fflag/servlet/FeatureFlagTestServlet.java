package com.hascode.tutorial.fflag.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hascode.tutorial.fflag.feature.UserFeatures;

@WebServlet(urlPatterns = "/fftest")
public class FeatureFlagTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(final HttpServletRequest req,
			final HttpServletResponse resp) throws ServletException,
			IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("Available features are:\n");
		if (UserFeatures.DISPLAY_SIMPLE_USER_PROFILE.isActive()) {
			sb.append("\t- Display simple user profiles is enabled\n");
		}
		if (UserFeatures.DISPLAY_EXTENDED_USER_PROFILE.isActive()) {
			sb.append("\t- Display extended user profiles is enabled\n");
		}
		resp.getWriter().append(sb.toString());
	}

}
