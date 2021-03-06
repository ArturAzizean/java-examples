package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){

            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);

            while (reader.ready()){
                String line = reader.readLine();
                String name = line.replaceAll("\\d", "").trim();
                String date = line.replace(name, "").trim();
                PEOPLE.add(new Person(name, sdf.parse(date)));
            }
            for (Person person : PEOPLE) System.out.println(person.getName() + " "+ person.getBirthDate());
        }
    }
}
