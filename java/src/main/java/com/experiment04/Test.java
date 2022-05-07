package com.experiment04;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentServiceImpl;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        DatabaseUtils data =new DatabaseUtils();
        List<Student> students = data.getStudents();
        StudentServiceImpl ssi = new StudentServiceImpl();
        Map<Student.Sex,List<Student>> stud;
        stud=ssi.mapStudentsBySex();
        List<String> name = ssi.listStudentsNames(18,Student.Sex.FAMALE);
        System.out.println(name);
        System.out.println("女同学有：");
        for (Student st : stud.get(Student.Sex.FAMALE)){
            System.out.println(st.getName());
        }
        System.out.println("男同学有：");
        for (Student st : stud.get(Student.Sex.MALE)){
            System.out.println(st.getName());
        }
    }
}
