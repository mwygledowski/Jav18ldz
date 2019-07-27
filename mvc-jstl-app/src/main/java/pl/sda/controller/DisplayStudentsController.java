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

import static pl.sda.dao.GroupConfigurationDao.getMinNumberOfStudentsToOpenGroup;

@WebServlet("/display-students")
public class DisplayStudentsController extends HttpServlet {

    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = studentDao.getStudents();
        req.setAttribute("students", students);
        req.setAttribute("enoughStudentsToOpenGroup", getMinNumberOfStudentsToOpenGroup() <= students.size());
        req.getRequestDispatcher("/display-students.jsp").forward(req, resp);
    }
}
