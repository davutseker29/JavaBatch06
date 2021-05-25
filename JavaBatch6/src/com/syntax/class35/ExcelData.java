package com.syntax.class35;

import java.util.Objects;

public class ExcelData {

    String name;
    double age;
    String rollNumber;
    double marks;

    public ExcelData(String name, double age, String rollNumber, double marks) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ExcelData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber='" + rollNumber + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExcelData)) return false;
        ExcelData excelData = (ExcelData) o;
        return Double.compare(excelData.getAge(), getAge()) == 0 &&
                Double.compare(excelData.getMarks(), getMarks()) == 0 &&
                Objects.equals(getName(), excelData.getName()) &&
                Objects.equals(getRollNumber(), excelData.getRollNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getRollNumber(), getMarks());
    }
}
