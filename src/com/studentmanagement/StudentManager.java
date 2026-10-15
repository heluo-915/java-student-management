package com.studentmanagement;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> list;

    public StudentManager(){
        this.list=new ArrayList<Student>();
    }

    void printAllStudents(){
        for (int i = 0; i < list.size(); i++) {
            Student temp=list.get(i);
            temp.showInfo();
        }
    }
    void addStudent(Student student){

        list.add(student);
    }

    void findByName(String name){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                list.get(i).showInfo();
                break;
            }
        }
    }

    void deleteByName(String name){
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.get(i).getName().equals(name)){
                list.remove(i);
                break;
            }
        }
    }

}
