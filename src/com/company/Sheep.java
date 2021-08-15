package com.company;

public class Sheep {
    private int weight;
    private int age;
    private Boolean gender;
    private String name;

    public Sheep() {

    }

    public Sheep(int weight, int age, Boolean gender, String name) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("error");
        }
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "sheep :" + "Weight :" + weight + "Age :" + age
                + "gender :" + gender + "Name :" + name + "\n";
    }

}
