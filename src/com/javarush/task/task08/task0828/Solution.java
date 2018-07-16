package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String , String > month = new HashMap<String , String>();
        month.put("January", "January is the 1 month" );
        month.put("February", "February is the 2 month" );
        month.put("March", "March is the 3 month" );
        month.put("April", "April is the 4 month" );
        month.put("May", "May is the 5 month" );
        month.put("June", "June is the 6 month" );
        month.put("July", "July is the 7 month" );
        month.put("August", "August is the 8 month" );
        month.put("September", "September is the 9 month" );
        month.put("October", "October is the 10 month" );
        month.put("November", "November is the 11 month" );
        month.put("December", "December is the 12 month" );

String monthName = reader.readLine();
        System.out.println(month.get(monthName));
        //напишите тут ваш код
    }
}
