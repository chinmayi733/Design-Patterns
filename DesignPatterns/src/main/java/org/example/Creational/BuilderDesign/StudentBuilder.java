package org.example.Creational.BuilderDesign;

public class StudentBuilder {

    public int rollNo;
    public String name;
    public int age;
    public String address;
    public String emailId;
    public String motherName;


    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

//    public StudentBuilder()
//    {
//
//    }

    public Student build()
    {
        Student student = new Student(this);
        return student;
    }
}
