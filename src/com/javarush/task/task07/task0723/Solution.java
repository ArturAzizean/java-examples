package com.javarush.task.task07.task0723;

/*
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            Thread.sleep(500);
            System.out.println(i);

            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
