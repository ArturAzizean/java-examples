package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stroki = new String[10];
        int [] cisla = new int[10];
        for (int i = 0; i <stroki.length ; i++) {
            stroki[i] = reader.readLine();
        }
        for (int i = 0; i <cisla.length ; i++) {
            cisla[i] = stroki[i].length();
        }
        for (int i = 0; i <cisla.length ; i++) {
            System.out.println(cisla[i]);
        }


        //напишите тут ваш код
    }
}
