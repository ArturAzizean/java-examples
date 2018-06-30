package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static class Cat{ }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);

        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);

    }


    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        //напишите тут ваш код. step 2 - пункт 2
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat koT : cats ){
            System.out.println(koT);
        }
        // step 4 - пункт 4
    }

    // step 1 - пункт 1
}
