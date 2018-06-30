package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Azizean", "Arsen");
        map.put("Azizean1", "Jora");
        map.put("Azizean2", "Iura");
        map.put("Azizean3", "Artur");
        map.put("Azizean4", "Anton");
        map.put("Azizean5", "asd");
        map.put("Azizean6", "Artsdsdasur");
        map.put("Azizean7", "Artuddr");
        map.put("Azizean8", "Artur");
        map.put("Azizean9", "Artur");

        //напишите тут ваш код
return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        List<String> allValues = new ArrayList<>(map.values());
        for (String a : allValues){
            if (Collections.frequency(allValues ,a )>1){
                removeItemFromMapByValue(map , a);
            }
        }
        //напишите тут ваш код
    }
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args) {

        }
    }

