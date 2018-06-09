package com.company;

public class Subject {
    private SubName name;



    public SubName getName() {
        return name;
    }

    public void setName(SubName name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "name=" + name +
                '}';
    }
}
