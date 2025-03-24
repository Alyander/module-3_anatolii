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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String answer = req.getParameter("answer");;
        int question = (int)session.getAttribute("question");
        if (DataClass.answersCorrections[question][Integer.parseInt(answer)]) {
            int score = (int) session.getAttribute("Score");
            session.setAttribute("Score", score + 1);
            if (question == DataClass.questions.length) {
                session.setAttribute("isWin", true);
            } else {
                session.setAttribute("question", question+1);
                session.setAttribute("questions", DataClass.questions[question+1]);
                session.setAttribute("answers", DataClass.answers[question+1]);
            }
        } else {
            session.setAttribute("isLose", true);
        }
    }
}
