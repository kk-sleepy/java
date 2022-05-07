package com.experiment05;

import com.experiment05.entity.College;
import com.experiment05.entity.Student;
import com.experiment05.entity.Teacher;
import com.experiment05.resource.DatabaseUtils;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCollegeName(DatabaseUtils.getStudents(),201001));
        printCollegeName(DatabaseUtils.getStudents(), 201001, 1002);
    }

    /**
     * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，返回 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     * @param students
     * @param sNumber
     * @return
     */
    private static String getCollegeName(List<Student> students, int sNumber) {
        String []name = new String[1];
        name[0] = "未知学院";
        students.stream()
                .filter(st -> st.getNumber() == sNumber)
                .collect(Collectors.toList())
                .forEach(st->{
                    name[0] = Optional.ofNullable(st)
                            .map(Student::getTeacher)
                            .map(Teacher::getCollege)
                            .map(College::getName)
                            .orElse("未知学院");
                });
        return name[0];
    }

    /**
     * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     * @param students
     * @param sNumber，学生编号
     * @param tNumber，教师编号
     */
    private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
        String []name = new String[1];
        name[0] = "未知学院";
        students.stream()
                .filter(st -> st.getNumber() == sNumber)
                .collect(Collectors.toList())
                .forEach(st->{
                    name[0] = Optional.ofNullable(st)
                            .map(Student::getTeacher)
                            .filter(t -> t.getNumber()==tNumber)
                            .map(Teacher::getCollege)
                            .map(College::getName)
                            .orElse("未知学院");
                });
        System.out.println(name[0]);
    }

}
