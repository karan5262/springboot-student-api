package org.example.studentmnagmentapi;

import org.example.studentmnagmentapi.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMnagmentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentMnagmentApiApplication.class, args);


        Student s = new Student(1L,"Karan","karan@gmail.com");
        System.out.println(s);
    }

}
