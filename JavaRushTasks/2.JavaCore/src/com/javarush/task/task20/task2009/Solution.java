package com.javarush.task.task20.task2009;

import java.io.*;

/*
Как сериализовать static?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) throws IOException {
        ClassWithStatic classWithStatic = new ClassWithStatic();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/home/artur/file/a"));
        objectOutputStream.writeObject(classWithStatic);
    }
}
