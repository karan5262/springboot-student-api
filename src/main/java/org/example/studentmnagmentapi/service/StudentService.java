package org.example.studentmnagmentapi.service;

import org.example.studentmnagmentapi.model.Student;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();


    public StudentService() {
        students.add(new Student(1L, "Karan", "karan@gmail.com"));
        students.add(new Student(2L, "Rahul", "rahul@gmail.com"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }
}