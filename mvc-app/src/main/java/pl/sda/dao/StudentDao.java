package pl.sda.dao;

import pl.sda.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private List<Student> students = loadMockData();

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public Student getStudent(int id){
        return students.stream().filter(s -> s.getId() == id).findAny().orElse(null);
    }

    private List<Student> loadMockData() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Roman", "Romantyczny"));
        students.add(new Student(2, "Adam","Adamski"));
        students.add(new Student(3,"Karol","Kowalski"));
        students.add(new Student(4,"Marcin", "Marcinkowski"));
        return students;
    }
}
