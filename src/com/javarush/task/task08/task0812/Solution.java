package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        // 1) Пройти по массиву
        // 2) Если одинковые то add в массив, дальше set(i+1)
        // 3) если нет ,тогда если следующие одинаковые аdd в массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            arr.add(Integer.parseInt(reader.readLine()));
        }
        int max = 1;
        int temp = 1;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).equals(arr.get(i+1))) {
                temp++;
                if (temp > max) {
                    max = temp;
                }
            }
            else{
                temp =1;
            }
        }
        System.out.println(max);
    }
    }
