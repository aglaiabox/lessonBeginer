package com.company.professions;

import com.company.Ageble;

public class Person implements Ageble {
    private int age;
    String fullName;

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        String a = "полное имя " + fullName + ", возраст "+age;
        return a;
    }
}
