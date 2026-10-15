package com.studentmanagement;

public class Student {
    private String name;
    private int age;
    private double score;

    // 公共无参构造
    public Student(){}

    // 带参构造，完整参数校验（包含NaN）
    public Student(String name, int age, double score) {
        // 姓名校验
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("姓名不能为空");
        }
        this.name = name;
        // 年龄校验
        if(age > 150 || age < 0) {
            throw new IllegalArgumentException("年龄范围必须是0~150");
        }
        this.age = age;
        // 成绩校验，额外拦截NaN
        if(Double.isNaN(score) || score > 100 || score < 0) {
            throw new IllegalArgumentException("成绩范围必须0~100，不允许NaN");
        }
        this.score = score;
    }

    // getter & setter 全部添加强校验
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("姓名不能为空");
        }
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age > 150 || age < 0) {
            throw new IllegalArgumentException("年龄范围必须是0~150");
        }
        this.age = age;
    }

    public double getScore(){
        return this.score;
    }
    public void setScore(double score){
        if(Double.isNaN(score) || score > 100 || score < 0) {
            throw new IllegalArgumentException("成绩范围必须0~100，不允许NaN");
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", score=" + score + "}";
    }

    // 判断是否及格
    public boolean isPassed(){
        return this.score >= 60;
    }

    // 打印完整信息，修复及格文字颠倒bug
    public void showInfo() {
        String level = isPassed() ? "及格" : "不及格";
        System.out.println("姓名：" + name + "，年龄：" + age + "，成绩：" + score + level);
    }
}
