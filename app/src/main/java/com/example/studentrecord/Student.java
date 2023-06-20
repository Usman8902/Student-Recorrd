package com.example.studentrecord;

public class Student {
    private String name;
    private String Rollno;
   private int Age;

    public Student(String name, String rollno,int age) {
        this.name = name;
        Rollno = rollno;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return Rollno;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public void setAge(int age) {
        Age = age;
    }
}
