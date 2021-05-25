package com.syntax.class35;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {



    public static void main(String[] args) {
        /*
        Dynamic in size
        Have ready made methods to manipulate data
         */
        List<Person> students=new ArrayList<>();
        students.add(new Person("Ismail",22));
        students.add(new Person("Ali",18));
        students.add(new Person("Sermed",18));
        students.add(new Person("Yunus",18));
        //checking the size of the Array
        System.out.println("size of the arraylist"+students.size());
        System.out.println(students);
        students.remove(new Person("Yunus",18));
        System.out.println("After removal"+students);

        //Works with String class because String class has overridden the equals method
        List<String> stringList=new ArrayList<>();
        stringList.add("Yunus");
        System.out.println("Before removing "+stringList);
        stringList.remove("Yunus");
        System.out.println("After removing "+stringList);









    }


}
