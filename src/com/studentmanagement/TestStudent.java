package com.studentmanagement;

public class TestStudent {
    public static void main(String[] args) {
        StudentManager sm=new StudentManager();
        sm.addStudent(new Student("张三",13,78));
        sm.addStudent(new Student("李四",16,54));
        sm.addStudent(new Student("王五",17,76));
        sm.printAllStudents();
        sm.findByName("李四");
        sm.deleteByName("李四");
        sm.printAllStudents();

    }
}
