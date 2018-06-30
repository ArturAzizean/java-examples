package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> max = new ArrayList<String>();

        for (int i = 0; i <5 ; i++) {
            String s = reader.readLine();
            strings.add(s) ;
        }

        max.add( strings.get(0));
        for (int i = 1; i <strings.size() ; i++) {
            if (max.get(0).length() < strings.get(i).length()) {
                max.set(0, strings.get(i));
            }
        }
        for (int i = 0; i <strings.size() ; i++) {
            if (max.get(0).length()==strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }
        }
        //напишите тут ваш код
    }
