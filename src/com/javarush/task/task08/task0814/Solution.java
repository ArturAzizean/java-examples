package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
Set<Integer> set = new HashSet<>();
        for (int i = 0; i <20 ; i++) {
            set.add(i);
        }
        return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
           int numbers = iterator.next();
           if (numbers>10) iterator.remove() ;
        }
        return set;
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
