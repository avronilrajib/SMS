
package com.mycompany.sms;


public abstract class Student {
    
// The student class has four properties namely studentID, Name, Age, Grade . 
//All these properties have respective methods to get and set object values.
    private String studentId,name;
    private int age;
    private double grade;

    
// The student class has two constructors, one is the default, and another one 
//is overloaded to accept all four properties and set them to object properties.
    public Student() {
        
    }

    public Student(String studentId, String name, int age, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    
// Getters and setters are used to protect your data, particularly when creating classes.
//For each instance variable, a getter method returns its value while a setter method sets or updates its value.
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
      //displayAllInfo() A method used to print all information.
     void displayAllInfo(){
         System.out.println("Student Id: "+studentId);
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         System.out.println("Grade: "+grade);
     }
     
     //Abstract methods are those types of methods that don't require implementation for its declaration. 
     //These methods don't have a body which means no implementation.
    abstract void calculateTuition();
}
