package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bolsoi [] = new int [20];
        int a[] = new int[10];
        int b[] = new int[10];
        int f = 0;
        for (int i = 0; i <bolsoi.length ; i++) {
            bolsoi[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <10 ; i++) { a[i] = bolsoi[i] ; }
        for (int i = 10; i <bolsoi.length ; i++) {
            b[f] = bolsoi[i];
            System.out.println(b[f]);
            f++;
        }
        //напишите тут ваш код
    }
}
