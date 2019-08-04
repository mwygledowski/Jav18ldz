package pl.sda.controller;

import pl.sda.model.Category;
import pl.sda.model.ToDoModel;
import pl.sda.service.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/to-do/edit")
public class EditController extends HttpServlet {

    ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = (String) req.getSession().getAttribute("login");
        long id = Long.parseLong(req.getParameter("id"));
        ToDoModel toDoModel = toDoService.getToDo(login, id);
        req.setAttribute("todo", toDoModel);
        req.setAttribute("categories", Category.values());
        req.getRequestDispatcher("/WEB-INF/views/edit-to-do.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String login = (String) req.getSession().getAttribute("login");
        String newTitle = req.getParameter("title");
        String newDescription = req.getParameter("description");
        LocalDateTime newDeadline = LocalDateTime.parse(req.getParameter("deadlineDate"));
        Category newCategory = Category.valueOf(req.getParameter("category"));
        long id = Long.parseLong(req.getParameter("id"));
        toDoService.edit(login, id, newTitle, newCategory, newDeadline, newDescription);
        resp.sendRedirect("/to-do/list");
    }
}
