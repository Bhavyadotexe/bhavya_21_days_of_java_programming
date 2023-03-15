package com.hashmap.coding;

import java.util.Objects;

public class Student {

      private final  String name;
       private final  int rollNo;

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    public Student(String id, int rollNo) {
        name = id;
        this.rollNo = rollNo;

        }
}
