package com.masai.recycler_view_we;

public class Student {
    private String Name;
     private int Age;
     private String rollNo;

    public Student(String name, int age, String rollNo) {
        this.Name = name;
       this.Age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getRollNo() {
        return rollNo;
    }
}

