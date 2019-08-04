package pl.sda.controller;

import pl.sda.service.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/markAsDone")
public class MarkAsDoneController extends HttpServlet {
    ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = "Unicorn";
        long id = Long.parseLong(req.getParameter("id"));
        toDoService.markAsDone(login, id);
        resp.sendRedirect("/list");

    }
}
