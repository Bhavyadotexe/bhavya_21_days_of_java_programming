package com.hashmap.coding;

import java.util.ArrayList;
import java.util.Objects;

public class CreatedArrayListWithCustomType {
    public static void main(String[] args) {

        ArrayList<Students> studentsList1 = new ArrayList<Students>();
        studentsList1.add(new Students("S1", 101));
        studentsList1.add(new Students("S2", 102));
        studentsList1.add(new Students("s6", 106));
        studentsList1.add(new Students("s4", 104));

        ArrayList<Students> studentsList2 = new ArrayList<Students>();
        studentsList2.add(new Students("s5", 105));
        studentsList2.add(new Students("s6", 106));
        studentsList2.add(new Students("s7", 107));

        System.out.println("\n----------Student List 1-----------");
        for (Students students : studentsList1) {
            System.out.println(students);
        }
        System.out.println("\n--------Student List 2-------------");
        for (Students students : studentsList2) {
            System.out.println(students);
        }

        studentsList1.retainAll(studentsList2);
        System.out.println("\n------------Student List1 after remove all----------");

        for (Students students : studentsList1) {
            System.out.println(students);
        }
        System.out.println("\n-----------contains()--------- ---");
        System.out.println(studentsList2.contains(new Students("s6", 106)));

        System.out.println("\n.............contains()---------");
        System.out.println(studentsList1.containsAll(studentsList2));
    }
}

    class Students {

        private String name;
        private int rollNo;

        Students(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Students students = (Students) o;
            return rollNo == students.rollNo;
        }

        @Override
        public int hashCode() {
            return Objects.hash(rollNo);
        }
    }
