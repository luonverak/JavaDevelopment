package com.java.development;

public class UserModel {
    private int id;
    private String name;
    private double height;
    private double weight;
    private int age;

    public UserModel(int id, String name, double height, double weight, int age) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
