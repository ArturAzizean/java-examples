package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JANUARY 5 1980"));
        map.put("Stallone1", new Date("JUNE 8 1980"));
        map.put("Stallone2", new Date("JUNE 4 1980"));
        map.put("Stallone3", new Date("JUNE 6 1980"));
        map.put("Stallone4", new Date("JUNE 7 1980"));
        map.put("Stallone5", new Date("JUNE 5 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("APRIL 1 1980"));
        map.put("Stallone8", new Date("MARCH 1 1980"));
        map.put("Stallone9", new Date("FEBRUARY 2 1980"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        int moth = 0;
        Map.Entry<String, Date> pair;
        while (iterator.hasNext()){
            pair = iterator.next();
        moth = pair.getValue().getMonth();
            if (moth>4 && moth<8) {
           iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
