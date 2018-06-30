package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String > spis = new ArrayList<String>();
        String ultim ;
        for (int i = 0; i <5 ; i++)
        {
            String vvod = reader.readLine();
            spis.add(vvod);
        }
        for (int i = 0; i <13 ; i++)
        {
            ultim = spis.get(spis.size()-1);
            spis.remove(spis.size()-1);
            spis.add(0 ,ultim);
        }

        for (int i = 0; i <spis.size() ; i++)
        {
            System.out.println(spis.get(i));
        }
        //напишите тут ваш код
    }
}
