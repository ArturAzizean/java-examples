package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Азизян1", "Артур");
        map.put("Азизян2", "Арсен");
        map.put("Азизян3", "Спартак");
        map.put("Сарджанян4", "Гаяне");
        map.put("Сарджанян5", "Вова");
        map.put("Сарджанян6", "Таня");
        map.put("Сарджанян7", "Гарик");
        map.put("Сарджанян8", "Зина");
        map.put("Бырладяну9", "Овсанна");
        map.put("Бырладяну10", "Кристиан");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код Имя
        int sovpadenii = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();

            if (value.equals(name)) sovpadenii++;
        }
        return sovpadenii;
}
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код . Фамилия
        int scet = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();

            if (key.equals(lastName)) {
                scet++;
            }
        }
return scet;
    }
    public static void main(String[] args) {
    }
}
