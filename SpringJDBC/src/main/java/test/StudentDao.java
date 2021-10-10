package test;

import java.util.List;

public interface StudentDao {
    int insert(Student student);
    int change(Student student);
    int delete(Student student);
    Student getStudent(String studentID);
    List <Student> getAllStudents(Student student);
}
