package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> minimumLeng = new ArrayList<String>();
        ArrayList<String> min = new ArrayList<String>();
        for (int i = 0; i <5 ; i++) {
            String s = reader.readLine();
            minimumLeng.add(s);
        }

        min.add(minimumLeng.get(0));
        for (int i = 1; i <minimumLeng.size() ; i++) {
            if (min.get(0).length()>minimumLeng.get(i).length()){
                min.set(0 , minimumLeng.get(i));
            }
        }

        for (int i = 0; i <minimumLeng.size() ; i++) {
            if (min.get(0).length()== minimumLeng.get(i).length()){
            System.out.println(minimumLeng.get(i));
            }
        }
        //напишите тут ваш код
    }
}
