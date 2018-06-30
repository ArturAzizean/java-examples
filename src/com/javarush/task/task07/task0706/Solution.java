package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumChet = 0;
        int sumNechet = 0;
        int[] array = new int [15];
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i%2==0) {
                sumChet = sumChet + array[i];
            }else sumNechet = sumNechet + array[i];
        }
        if (sumChet>sumNechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else System.out.println("В домах с нечетными номерами проживает больше жителей.");

        //напишите тут ваш код
    }
}
