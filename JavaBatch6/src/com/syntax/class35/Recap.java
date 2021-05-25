package com.syntax.class35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recap {
    public static void main(String[] args) {
     /*  String name="Syntax";
       String name1="Shushil Sharma";
       String name2="Servet";
        String[] nameList={"Shushil"};*/
        //nameList[1]="Servet";
        //Arrays are fixed in size
        //Collection framework in java
        //Its dynamic
        //It has built in methods to manipulate the date
        /*

         */

     /*   String name3= "Syntax";
        name3="Ali";*/
          String nameExample="Yunus";
          System.out.println("Demo of removing elements from the Array");
          int[] intArray=new int[100];
          intArray[0]=0;
          intArray[1]=20;
          System.out.println("Default values"+ Arrays.toString(intArray));
          intArray=new int[10];



        //System.out.println(name3==name4);

        String[] stringArray=new String[2];
        stringArray[0]="Ali";
        stringArray[1]="Syntax";
        //stringArray[2]="Farid";



        for (String arrayName:stringArray
             ) {
            if(arrayName.equals("Ali")){
                System.out.println("Ali found");
            }
        }

        List<String> arrayList=new ArrayList<>();
        arrayList.add("Ali");
        arrayList.add("Syntax");

        System.out.println(arrayList.contains("Ali"));

        List<String> list=new ArrayList<>();






    }
}
