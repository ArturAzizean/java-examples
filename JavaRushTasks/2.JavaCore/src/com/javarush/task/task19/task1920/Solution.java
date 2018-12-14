package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        try(FileReader reader = new FileReader(args[0]);
            BufferedReader reader1 = new BufferedReader(reader)){

            TreeMap<String, Double> stringDoubleMap = new TreeMap<>();

            while (reader1.ready()) {
                String[] arrFile = reader1.readLine().split(" ");
                if (stringDoubleMap.containsKey(arrFile[0])) {
                    stringDoubleMap.put(arrFile[0], stringDoubleMap.get(arrFile[0]) + Double.parseDouble(arrFile[1]));

                } else {
                    stringDoubleMap.put(arrFile[0], Double.parseDouble(arrFile[1]));
                }
            }
            double max = 0;
            for (Map.Entry<String, Double> entry : stringDoubleMap.entrySet()){
                if (entry.getValue() >= max) max = entry.getValue();
            }
            for (Map.Entry<String, Double> entry : stringDoubleMap.entrySet()){
                if (entry.getValue() == max) System.out.println(entry.getKey());
            }


        }
    }
}
