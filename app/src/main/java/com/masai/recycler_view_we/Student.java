package com.masai.recycler_view_we;

public class Student {
    String Name;
    int Age;
    String RollNo;

    public Student(String name, int age, String rollNo) {
        Name = name;
        Age = age;
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getRollNo() {
        return RollNo;
    }
}

