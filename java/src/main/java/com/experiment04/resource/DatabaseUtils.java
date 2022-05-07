package com.experiment04.resource;

import com.experiment04.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student>STUDENTS = creat();
    private static List<Student> creat(){
        Student student1 = new Student(2020212760,"kk", Student.Sex.MALE,18);
        Student student2 = new Student(2020212760,"zzy", Student.Sex.MALE,18);
        Student student3 = new Student(2020212760,"amy", Student.Sex.FAMALE,18);
        List<Student> students =new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;
    }
    public static List<Student> getStudents(){
        return STUDENTS;
    }
}
