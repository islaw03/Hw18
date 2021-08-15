package com.company;

public class Hors {
    private int weigth;
    private int age;
    private boolean gender;
    private String nickname;

    public Hors() {

    }

    public Hors(int weigth, int age, boolean gender, String nickname) {
        this.weigth = weigth;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String toString() {
        return "Hors :" + "Weight :" + weigth + "Age :" + age
                + "gender :" + gender + "Name :" + nickname + "\n";
    }
}
