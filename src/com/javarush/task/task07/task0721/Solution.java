package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] chisla = new int[20];
        for (int i = 0; i <chisla.length ; i++) {
            chisla[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = chisla[0];
        int minimum = chisla[0];
        for (int i = 1; i <chisla.length ; i++) {
            if (chisla[i]>=maximum) maximum = chisla[i];
            else if (chisla[i]<minimum) minimum = chisla[i];
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
