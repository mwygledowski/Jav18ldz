package pl.sda.controller;

import pl.sda.dao.StudentDao;
import pl.sda.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-student")
public class AddStudentController extends HttpServlet {

    private final StudentDao studentDao = new StudentDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student(Integer.valueOf(req.getParameter("studentId")), req.getParameter("firstName"), req.getParameter("lastName"));
        studentDao.addStudent(student);
        resp.sendRedirect(req.getContextPath() + "/home");
    }
}
