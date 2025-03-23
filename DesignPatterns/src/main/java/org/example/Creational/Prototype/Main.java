package org.example.Creational.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher(1000, "Nitu");
        Student student1 = new Student(20,  teacher,"John");
        Student student2 = (Student) student1.clone();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        student1.setName("chinu");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        //shallow copy of nested objects if we use clone directly from cloneable interface

        //To fix this we need deep copy
        student1.getTeacher().setName("Ritu");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
