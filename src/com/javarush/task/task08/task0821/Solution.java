package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
HashMap<String, String> persons = new HashMap<>();
        persons.put("Azizean","Artur");
        persons.put("Azizean","Artur");
        persons.put("Azizean1","Artur1");
        persons.put("Azizean2","Artur2");
        persons.put("Azizean3","Artur3");
        persons.put("Azizean4","Artur4");
        persons.put("Azizean5","Artur5");
        persons.put("Azizean6","Artur6");
        persons.put("Azizean7","Artur7");
        persons.put("Azizean8","Artur8");
        return persons;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
