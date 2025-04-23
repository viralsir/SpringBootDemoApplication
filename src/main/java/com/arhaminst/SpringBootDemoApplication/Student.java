package com.arhaminst.SpringBootDemoApplication;


public class Student
{
    int rollno;
    String name;
    int age;
    int fees;

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public Student() {
    }

    public Student(int rollno, String name, int age,int fees) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.fees = fees;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
