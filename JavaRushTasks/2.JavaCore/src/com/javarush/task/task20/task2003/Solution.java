package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        load(fileInputStream);

        fileInputStream.close();

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        properties.forEach(p::setProperty);
        p.store(outputStream, null);
        outputStream.close();

//            for (Map.Entry<String, String> map : properties.entrySet()) {
//                writer.println(map.getValue());
//                writer.println(map.getValue());
//            }
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        p.load(inputStream);
        p.forEach((k, v)-> properties.put(String.valueOf(k), String.valueOf(v)));
        inputStream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        properties.forEach((k, v)-> System.out.println(k +" "+ v));
    }
}
