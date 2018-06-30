package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.parseInt(reader.readLine());
        if (maximum>0) {
            int[] tri = new int[maximum];
            for (int i = 0; i < tri.length ; i++) {
              tri[i] = Integer.parseInt(reader.readLine());
            }
            int max = tri[0];
            for (int i = 1; i <tri.length ; i++) {
                if (tri[i]>max){
                    max = tri[i];
                }
            }

        //напишите тут ваш код

        System.out.println(max);
    }
}
}
