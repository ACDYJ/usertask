package com.jie.usertask.entities;

public class Task {
    private int taskId;
    private int id;
    private String material;
    private int wavelength;
    private String structrues;
    private int accuracy;
    private String splitter;

    private int xup;
    private int xdown;
    private int yup;
    private int ydown;
    private int zup;
    private int zdown;
    private double length;
    private double width;
    private double height;

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }

    public void setStructrues(String structrues) {
        this.structrues = structrues;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setSplitter(String splitter) {
        this.splitter = splitter;
    }

    public void setXup(int xup) {
        this.xup = xup;
    }

    public void setXdown(int xdown) {
        this.xdown = xdown;
    }

    public void setYup(int yup) {
        this.yup = yup;
    }

    public void setYdown(int ydown) {
        this.ydown = ydown;
    }

    public void setZup(int zup) {
        this.zup = zup;
    }

    public void setZdown(int zdown) {
        this.zdown = zdown;
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

    public int getTaskId() {
        return taskId;
    }

    public int getId() {
        return id;
    }

    public String getMaterial() {
        return material;
    }

    public int getWavelength() {
        return wavelength;
    }

    public String getStructrues() {
        return structrues;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public String getSplitter() {
        return splitter;
    }

    public int getXup() {
        return xup;
    }

    public int getXdown() {
        return xdown;
    }

    public int getYup() {
        return yup;
    }

    public int getYdown() {
        return ydown;
    }

    public int getZup() {
        return zup;
    }

    public int getZdown() {
        return zdown;
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

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", id=" + id +
                ", material='" + material + '\'' +
                ", wavelength=" + wavelength +
                ", structrues='" + structrues + '\'' +
                ", accuracy=" + accuracy +
                ", splitter='" + splitter + '\'' +
                ", xup=" + xup +
                ", xdown=" + xdown +
                ", yup=" + yup +
                ", ydown=" + ydown +
                ", zup=" + zup +
                ", zdown=" + zdown +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
