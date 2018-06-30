package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> max = new ArrayList<String>();
        ArrayList<String> min = new ArrayList<String>();
        for (int i = 0; i <10 ; i++) {
            list.add(reader.readLine());
        }
        max.add(list.get(0));
        for (int i = 1; i <list.size() ; i++)
        { if (max.get(0).length()<list.get(i).length()) max.set(0 , list.get(i));

        }min.add(list.get(0));
        for (int i = 1; i <list.size() ; i++)
        { if (min.get(0).length()>list.get(i).length()) min.set(0,list.get(i));

        }
        for (int i = 0; i <list.size() ; i++)
        {
            if (max.get(0).length()==list.get(i).length())
            {
                System.out.println(max.get(0));
            break;
            } else if (min.get(0).length() == list.get(i).length())
            {
                System.out.println(min.get(0));
            break;
            }
        }


        //напишите тут ваш код
    }
}
