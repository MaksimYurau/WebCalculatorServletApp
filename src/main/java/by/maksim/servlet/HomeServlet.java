package by.maksim.servlet;

import by.maksim.service.CalcOperations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    private CalcOperations calcOperations = new CalcOperations();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String opType = req.getParameter("opType");
        double result = calcOperations.calculate(opType, Integer.parseInt(x), Integer.parseInt(y));
        resp.getWriter().println(result);
    }
}