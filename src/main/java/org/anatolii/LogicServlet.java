package org.anatolii;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogicServlet", value="/logic")
public class LogicServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String answer = req.getParameter("answer");;
        int question = (int)session.getAttribute("question");
        if (question > 2) {
            StartingServlet.logger.error("Invalid answer from user:{}", session.getAttribute("user"));
        }
        StartingServlet.logger.info("Checking answer from {}", session.getAttribute("user"));
        if (DataClass.answersCorrections[question][Integer.parseInt(answer)]) {
            int score = (int) session.getAttribute("Score");
            session.setAttribute("Score", score + 1);
            if (question == DataClass.questions.length-1) {
                session.setAttribute("isWin", true);
                StartingServlet.logger.info("{} won", session.getAttribute("user"));
                resp.sendRedirect("/result.jsp");
                return;
            } else {
                int questionCount = question+1;
                session.setAttribute("question", questionCount);
                session.setAttribute("questions", DataClass.questions[questionCount]);
                session.setAttribute("answers", DataClass.answers[questionCount]);
                resp.sendRedirect("/quest.jsp");
                StartingServlet.logger.info("{} correct answered question:{}", session.getAttribute("user"), questionCount - 1);
                return;
            }
        } else {
            session.setAttribute("isLose", true);
            StartingServlet.logger.info("{} lose", session.getAttribute("user"));
            resp.sendRedirect("/result.jsp");
        }
    }
}
