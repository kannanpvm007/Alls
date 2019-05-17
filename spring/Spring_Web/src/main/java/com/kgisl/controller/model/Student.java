package com.kgisl.controller.model;

/**
 * Student
 */
public class Student {

private int id;
    private String name;
    private String email;
    private String course;

    /**
     * @return the id
     */
    public Student(int id,String name,String email,String course){
        this.id=id;
        this.email=email;
        this.course=course;
        this.name=name;
        
    }
    public int getId() {
        return id;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return id+""+name+""+email+""+course;
    }


}