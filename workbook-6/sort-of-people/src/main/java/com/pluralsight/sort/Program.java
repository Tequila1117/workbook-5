package com.pluralsight.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<>();
        Person p = new Person("Dad", "Ridgeway", 55);
       Person a = new Person("Mom", "Hamilton", 50);
        Person b = new Person("Tequila", "Ridgeway", 28);
        myFamily.add(p);
        myFamily.add(a);
        myFamily.add(b);

        Collections.sort(myFamily);
        Collections.reverse(myFamily);

        for(Person h : myFamily) {
            System.out.println(h);


        }

    }


    }

