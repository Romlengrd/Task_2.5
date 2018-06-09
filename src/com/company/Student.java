package com.company;

import java.util.Arrays;

public class Student <T> {
    private String name;
    private int[] groupID;
    private T[] mark;

    public Student() {
    }

    public Student(String name, int[] groupID, T[] mark) {
        this.name = name;
        this.groupID = groupID;
        this.mark= mark;
    }

   public T[] getMark() {
        return mark;
    }

   public void setMark(T[] mark) {
      this.mark = mark;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGroupID() {
        return groupID;
    }

    public void setGroupID(int[] groupID) {
        this.groupID = groupID;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupID=" + Arrays.toString(groupID) +
                ", mark=" + Arrays.toString(mark) +
                '}';
    }
}
