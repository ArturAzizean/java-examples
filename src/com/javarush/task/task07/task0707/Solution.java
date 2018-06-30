package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> artList = new ArrayList<String>();
        artList.add(0 , "Первая запись ");
        artList.add(1," Вторая запись");
        artList.add(2 , " 3 Zap");
        artList.add(3 , " 4 Zap");
        artList.add(4, "5 Zap");
        System.out.println(artList.size());
        for (int i = 0; i <5 ; i++) {
            System.out.println(artList.get(i));
        }
        //напишите тут ваш код
    }
}
