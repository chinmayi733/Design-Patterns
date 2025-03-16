package org.example.BuilderDesign;

public class Student {

    public int rollNo;
    public String name;
    public int age;
    public String address;
    public String emailId;
    public String motherName;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getMotherName() {
        return motherName;
    }

    public Student(StudentBuilder s)
    {
        this.rollNo=s.rollNo;
        this.name=s.name;
        this.age=s.age;
        this.address=s.address;
        this.emailId=s.emailId;
        this.motherName=s.motherName;
    }
}
