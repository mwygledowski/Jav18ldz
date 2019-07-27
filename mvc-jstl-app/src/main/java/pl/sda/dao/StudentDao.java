package pl.sda.dao;

import pl.sda.model.Student;

import java.time.LocalDate;
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
        students.add(new Student(1, "Roman", "Romantyczny", LocalDate.of(1980, 5, 5)));
        students.add(new Student(2, "Adam","Adamski", LocalDate.of(2008, 1,20)));
        students.add(new Student(3,"Karolina","Kowalski", LocalDate.of(1990, 9, 11)));
        students.add(new Student(4,"Marcin", "Marcinkowski", LocalDate.of(2000, 8, 1)));
        return students;
    }
}
