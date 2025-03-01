package com.example.ph54264_02032025.entity;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private double mark;

    public SinhVien() {
    }

    public SinhVien(int id, String name, int age, double mark) {
        this.id = id;
        setName(name);
        setAge(age);
        setMark(mark);
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
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark < 0 || mark > 10) {
            throw new IllegalArgumentException("Mark cannot be negative");
        }
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
