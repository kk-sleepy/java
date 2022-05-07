package com.experiment04.service;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentServiceImpl implements StudentService{
    DatabaseUtils data =new DatabaseUtils();
    List<Student> students = data.getStudents();
    public List<Student> addStudent(Student student){
        students.add(student);
        return students;
    }
    public List<Student> listStudentsByYear(int year){
        Stream<Student>studentStream = students.stream();
        Stream<Student>yearStream = studentStream.filter(st -> year==st.getYear());
        List<Student> stu =yearStream.collect(Collectors.toList());
        return stu;
    }
    public List<String> listStudentsNames(int year, Student.Sex sex){
        Stream<String> studentStream =
        students.stream()
                .filter(st -> year==st.getYear())
                .filter(st -> sex == st.getSex())
                .map(st -> st.getName());

        List<String> name = studentStream.collect(Collectors.toList());
        return name;
    }
    public Map<Student.Sex,List<Student>> mapStudentsBySex(){
        Map<Student.Sex,List<Student>> stu = new HashMap<>();
        Stream<Student>FstudentStream = students.stream()
                .filter(st -> st.getSex() == Student.Sex.FAMALE);
        List<Student> fst = FstudentStream.collect(Collectors.toList());
        Stream<Student>MstudentStream = students.stream()
                .filter(st -> st.getSex() == Student.Sex.MALE);
        List<Student> mst = FstudentStream.collect(Collectors.toList());
        stu.put(Student.Sex.FAMALE,fst);
        stu.put(Student.Sex.MALE,mst);
        return stu;
    }
    public boolean removeStudent(int id){
        boolean flag=false;
        Iterator<Student> stu = students.listIterator();
        while (stu.hasNext()){
            Student st = stu.next();
            if(st.getId()==id){
                flag=true;
                stu.remove();
            }
        }
        return flag;
    }
}
