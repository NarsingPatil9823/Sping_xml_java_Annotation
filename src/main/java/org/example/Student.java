package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component annotation is used to indicate that a class is a Spring component.
// creates a bean for the class and registers it in the Spring application context.
@Component("bean8")
public class Student {

    @Value("8")
    private int id;

    @Value("Sneha Patil")
    private String name;

    @Value("snehapatil@gmail.com")
    private String email;

    public Student() {
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

public void display() {
    System.out.println(id+" | "+name+" | "+email);
}
    }

