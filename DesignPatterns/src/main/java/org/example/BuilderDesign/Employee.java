package org.example.BuilderDesign;

public class Employee {

    public int id;
    public String name;
    public int age;

    public int getId() {
        return id;
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

    public String address;
    public String emailId;


    public Employee(Builder b)
    {
        this.address=b.address;
        this.age =b.age;
        this.emailId=b.emailId;
        this.id= b.id;
        this.name= b.name;
    }

    public static class Builder
    {
        public String address;
        public String emailId;
        public int id;
        public String name;
        public int age;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public static Builder newInstance()
        {
            return new Builder();
        }

        public Builder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Employee build()
        {
            Employee e = new Employee(this);
            return e;
        }
    }


}
