package com.jie.usertask.entities;

public class Task {
    private int taskId;
    private int id;
    private String taskType;
    private String taskDesc;
    private String startTime;
    private int accuracy;
    private String material;
    private String splitter;
    private double length;
    private double width;
    private double height;

    public int getTaskId() {
        return taskId;
    }

    public int getId() {
        return id;
    }

    public String getTaskType() {
        return taskType;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public String getStartTime() {
        return startTime;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public String getMaterial() {
        return material;
    }

    public String getSplitter() {
        return splitter;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSplitter(String splitter) {
        this.splitter = splitter;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", id=" + id +
                ", taskType='" + taskType + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", startTime='" + startTime + '\'' +
                ", accuracy=" + accuracy +
                ", material='" + material + '\'' +
                ", splitter='" + splitter + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
