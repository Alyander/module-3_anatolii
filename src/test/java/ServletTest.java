import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.anatolii.RestartServlet;
import org.anatolii.StartingServlet;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.anatolii.DataClass;
import org.anatolii.LogicServlet;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class ServletTest {
    private LogicServlet logicServlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;

    @BeforeEach
    void setUp() {
        logicServlet = new LogicServlet();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);

        when(request.getSession()).thenReturn(session);
    }
    @Test
    void LogicServletNextQuestionTest() throws ServletException, IOException {
        int  questionCount = 1;
        when(request.getSession()).thenReturn(session);
        when(request.getParameter("answer")).thenReturn("1");
        when(session.getAttribute("question")).thenReturn(0);
        when(session.getAttribute("Score")).thenReturn(0);
        when(session.getAttribute("user")).thenReturn("abraham");
        Mockito.doNothing().when(session).setAttribute("question", questionCount);
        Mockito.doNothing().when(session).setAttribute("Score", questionCount);
        Mockito.doNothing().when(session).setAttribute("questions", DataClass.questions[questionCount]);
        Mockito.doNothing().when(session).setAttribute("answers", DataClass.answers[questionCount]);
        logicServlet.doGet(request, response);
        verify(session).getAttribute("question");
        verify(session).getAttribute("Score");
        verify(session).setAttribute("questions", DataClass.questions[questionCount]);
        verify(session).setAttribute("answers", DataClass.answers[questionCount]);
    }
    @Test
    void LogicServletLoseGameTest() throws ServletException, IOException {
        int  questionCount = 1;
        when(request.getSession()).thenReturn(session);
        when(request.getParameter("answer")).thenReturn("0");
        when(session.getAttribute("question")).thenReturn(0);
        when(session.getAttribute("Score")).thenReturn(0);
        when(session.getAttribute("user")).thenReturn("abraham");
        Mockito.doNothing().when(session).setAttribute("question", questionCount);
        Mockito.doNothing().when(session).setAttribute("Score", questionCount);
        Mockito.doNothing().when(session).setAttribute("questions", DataClass.questions[questionCount]);
        Mockito.doNothing().when(session).setAttribute("answers", DataClass.answers[questionCount]);
        logicServlet.doGet(request, response);
        verify(session).setAttribute("isLose", true);
    }
    @Test
    void LogicServletWinGameTest() throws ServletException, IOException {
        int  questionCount = 1;
        when(request.getSession()).thenReturn(session);
        when(request.getParameter("answer")).thenReturn("2");
        when(session.getAttribute("question")).thenReturn(9);
        when(session.getAttribute("Score")).thenReturn(9);
        when(session.getAttribute("user")).thenReturn("abraham");
        Mockito.doNothing().when(session).setAttribute("question", questionCount);
        Mockito.doNothing().when(session).setAttribute("Score", questionCount);
        Mockito.doNothing().when(session).setAttribute("questions", DataClass.questions[questionCount]);
        Mockito.doNothing().when(session).setAttribute("answers", DataClass.answers[questionCount]);
        logicServlet.doGet(request, response);
        verify(session).setAttribute("isWin", true);
    }
    @Test
    void StartingServletTest() throws ServletException, IOException {
        StartingServlet startingServlet = new StartingServlet();
        when(request.getSession(true)).thenReturn(session);
        when(request.getParameter("name")).thenReturn("abraham");
        String userName = request.getParameter("name");
        startingServlet.doGet(request, response);
        verify(session).setAttribute("user", userName);
        verify(session).setAttribute("questions", DataClass.questions[0]);
        verify(session).setAttribute("answers", DataClass.answers[0]);
        verify(session).setAttribute("question", 0);
        verify(session).setAttribute("isLose", false);
        verify(session).setAttribute("isWin", false);
        verify(session).setAttribute("Score", 0);
        verify(response).sendRedirect("/prestart.jsp");
    }
    @Test
    void RestartServletTest() throws ServletException, IOException {
        RestartServlet restartServlet = new RestartServlet();
        restartServlet.doGet(request, response);
        verify(session).invalidate();
        verify(response).sendRedirect("/index.jsp");
    }
}
