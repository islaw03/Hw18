package com.company;

public class Cow {
    private int weigth;
    private int age;
    private Boolean gender;
    private String name;

    public Cow() {

    }

    public Cow(int weigth, int age, Boolean gender, String name) {
        this.weigth = weigth;
        this.age = age;
        this.gender = gender;
        this.name = name;

    }

    public int getWeigth() {
        return weigth;

    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;

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

    public void setGender(boolean gender) {
        this.gender = gender;


    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }
    public String toString(){
        return "Cow :" + "Weight :" + weigth + "Age :" + age
                + "gender :" + gender + "Name :" + name + "\n";
    }
}

