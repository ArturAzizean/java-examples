package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> spisok = new ArrayList<String>();
        for (int i = 0; i <10 ; i++) {
            String vvod = reader.readLine();
            spisok.add(0 ,vvod);
        }
            for (int j = 0; j <spisok.size() ; j++) {
                System.out.println(spisok.get(j));
            }
        }
        //напишите тут ваш код
    }

