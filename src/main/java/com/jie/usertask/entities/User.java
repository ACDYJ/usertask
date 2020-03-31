package com.jie.usertask.entities;


public class User {
    private Integer id;
    private String StudentId;
    private String password;

    public Integer getId() {
        return id;
    }

    public String getStudentId() {
        return StudentId;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", StudentId='" + StudentId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
