package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> na3 = new ArrayList<Integer>();
        ArrayList<Integer> na2 = new ArrayList<Integer>();
        ArrayList<Integer> ostolnie = new ArrayList<Integer>();
        for (int i = 0; i <20 ; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
            if (list.get(i)%3==0 && list.get(i)%2 == 0)
            {
                na3.add(list.get(i));
                na2.add(list.get(i));
            }
            else if (list.get(i)%3==0) na3.add(list.get(i));
            else if (list.get(i)%2==0) na2.add(list.get(i));
            else ostolnie.add(list.get(i));
        }
        printList(na3);
        printList(na2);
        printList(ostolnie);
        //напишите тут ваш код
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
