package pl.sda.controller;

import pl.sda.dao.StudentDao;
import pl.sda.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search-by-name")
public class SearchByNameController extends HttpServlet {

    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = studentDao.findByName(req.getParameter("studentName"));
        req.setAttribute("students", students);
        req.getRequestDispatcher("/WEB-INF/view/student-info.jsp").forward(req, resp);
    }
}
