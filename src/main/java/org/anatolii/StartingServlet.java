package org.anatolii;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "StartingServlet", value = "/start")
public class StartingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setAttribute("questions", DataClass.questions[0]);
        session.setAttribute("answers", DataClass.answers[0]);
        session.setAttribute("question", 0);
        session.setAttribute("isLose", false);
        session.setAttribute("isWin", false);
        session.setAttribute("Score", 0);
        session.setAttribute("User", request.getParameter("name"));
        response.sendRedirect("/quest.jsp");

    }
}
