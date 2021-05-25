package com.syntax.class35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<Person> students=new HashSet<>();
        students.add(new Person("Ismail",22));
        students.add(new Person("Ali",18));
        students.add(new Person("Sermed",18));
        students.add(new Person("Yunus",18));
        //checking the size of the Array
        System.out.println("size of the arraylist"+students.size());
        System.out.println(students);
        System.out.println( students.contains(new Person("Yunus",18)));
        System.out.println("After removal"+students);
    }
}
