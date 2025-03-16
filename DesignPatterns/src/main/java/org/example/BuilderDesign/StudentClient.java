package org.example.BuilderDesign;

public class StudentClient {

    public static void main(String[] args) {

        StudentDirector director = new StudentDirector(new StudentBuilder());
        Student s1 = director.getStudent();
        System.out.println(s1.getMotherName());
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}
