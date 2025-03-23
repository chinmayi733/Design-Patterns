package org.example.Creational.Prototype;

public class Student implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        //(This can be used when main object does not have a nested object)
        // return super.clone();

        //Deep copy
        Teacher t = new Teacher(this.teacher.getSalary(), this.teacher.getName());
        Student student = new Student(this.age, t,this.name);
        return student;

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private int age;
   private Teacher teacher;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

   Student(int age, Teacher teacher, String name) {
      this.age = age;
       this.teacher = teacher;
       this.name = name;
   }

   public String toString() {
      return "Student [age=" + age + ", name=" + name + " + teacher=" + teacher.getName() + "]";
   }
}
