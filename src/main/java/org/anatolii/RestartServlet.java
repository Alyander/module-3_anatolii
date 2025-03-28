package org.anatolii;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "RestartServlet", value="/restart")
public class RestartServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        StartingServlet.logger.info("Restart for " + session.getAttribute("user"));
        session.invalidate();
        response.sendRedirect("/index.jsp");
    }
}
