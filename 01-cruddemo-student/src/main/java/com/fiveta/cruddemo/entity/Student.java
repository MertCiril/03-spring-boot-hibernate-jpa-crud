package com.fiveta.cruddemo.entity;

import jakarta.persistence.*;

//bu sınıfın bir veri tabanı tablosuyla eşleşeceğini belirtir
@Entity
//Tabloyu belirtiyoruz
@Table(name="student")
public class Student {

    // define fields
    //id olduğunu belirtiyoruz
    @Id
    // sql de otomatik olarak artabilmesini sağlar
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    // define constructors
    public Student(String firstName, String lastName, String email) {
        //id yok çünkü otomatik oluşacak
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    // define getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // define toString() method
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
