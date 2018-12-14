package com.javarush.task.task20.task2017;

import java.io.*;

/* 
Десериализация
*/
public class Solution implements Serializable{
    public A getOriginalObject(ObjectInputStream objectStream) {
        A a = null;
        try {
             a = (A) objectStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return a;
        }
        return a;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/home/artur/file/a"));
        outputStream.writeObject(new Solution().new A());

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/home/artur/file/b"));
        A aa = new Solution().getOriginalObject(inputStream);
    }
}
