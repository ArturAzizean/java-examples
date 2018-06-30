package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> word = new ArrayList<String>();

        word.add("мама");
        word.add("мыла");
        word.add("раму");

        for (int i = 0; i < 3; i++)
            word.add(i * 2 + 1, "именно");

        for (int i=0; i<word.size(); i++) {
            System.out.println(word.get(i));
        }
        //напишите тут ваш код
    }
}
