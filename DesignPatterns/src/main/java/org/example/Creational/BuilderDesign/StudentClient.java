package org.example.Creational.BuilderDesign;

public class StudentClient {

    public static void main(String[] args) {

        //using client director steps
        StudentDirector director = new StudentDirector(new StudentBuilder());
        Student s1 = director.getStudent();
        System.out.println(s1.getMotherName());
        System.out.println(s1.getAge());
        System.out.println(s1.getName());



        //using inner class
        Employee e =  Employee.Builder.newInstance().setAge(11).setName("nitu").build();
        System.out.println(e.getAddress());
        System.out.println(e.getName());

//        examples: stringbuilder class
//                @builder in lombok
    }
}
