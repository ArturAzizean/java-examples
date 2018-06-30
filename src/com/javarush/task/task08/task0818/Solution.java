package com.javarush.task.task08.task0818;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> klienti = new HashMap<>();
        klienti.put("Азизян", 200);
        klienti.put("Азизян1", 300);
        klienti.put("Азизян2", 400);
        klienti.put("Азизян3", 100);
        klienti.put("Азизян4", 200);
        klienti.put("Азизян5", 500);
        klienti.put("Азизян6", 400);
        klienti.put("Азизян7", 900);
        klienti.put("Азизян8", 900);
        klienti.put("Азизян9", 900);

        return klienti;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            String key = pair.getKey();
            int  value = pair.getValue();
            if (value<500) map.remove(pair.getKey()); // должна быть копия ю
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}