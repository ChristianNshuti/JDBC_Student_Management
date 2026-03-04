package student.service;

import student.dao.StudentDAO;
import student.entity.Student;

import java.util.List;

public class StudentService {

    private final StudentDAO studentDAO = new StudentDAO();

    public void createStudent(String name,String email,int age) {
        Student student = new Student(name,email,age);
        studentDAO.saveStudent(student);
    }

    public List<Student> getStudents() {
        return studentDAO.getAllStudents();
    }

    public void updateStudent(Long id,String name) {
        studentDAO.updateStudent(id,name);
    }

    public void deleteStudent(Long id) {
        studentDAO.deleteStudent(id);
    }
}