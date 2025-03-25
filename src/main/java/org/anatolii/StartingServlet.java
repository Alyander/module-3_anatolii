package org.anatolii;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

@WebServlet(name = "StartingServlet", value = "/start")
public class StartingServlet extends HttpServlet {
    public static final Logger logger = LogManager.getLogger(StartingServlet.class);
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String userName = request.getParameter("name");
        if (userName == null) {
            logger.warn("User name is null");
        }
        session.setAttribute("questions", DataClass.questions[0]);
        session.setAttribute("answers", DataClass.answers[0]);
        session.setAttribute("question", 0);
        session.setAttribute("isLose", false);
        session.setAttribute("isWin", false);
        session.setAttribute("Score", 0);
        session.setAttribute("user",userName);
        logger.info("New game started by user: {}", userName);
        response.sendRedirect("/prestart.jsp");
    }
}
