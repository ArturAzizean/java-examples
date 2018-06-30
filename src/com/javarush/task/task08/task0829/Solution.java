package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> aa = new HashMap<>();

        while (true) {
            String cityKey = reader.readLine();
            if (cityKey.isEmpty()) break;
            String familyValue = reader.readLine();
            aa.put(cityKey, familyValue);
        }
        String gorod = reader.readLine();
        for (Map.Entry<String, String> pair : aa.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (key.equals(gorod)) {
                System.out.println(value);
            }


        }
    }
}
