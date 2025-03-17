package org.example.Creational.BuilderDesign;

public class StudentDirector {

    private StudentBuilder s ;

    public StudentDirector(StudentBuilder s)
    {
        this.s=s;
    }

    public Student getStudent()
    {
        return s.setRollNo(10).setAge(11).setEmailId("chinmayee").setName("chinu").build();
    }
}
