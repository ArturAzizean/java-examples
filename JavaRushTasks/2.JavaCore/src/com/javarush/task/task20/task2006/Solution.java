package com.javarush.task.task20.task2006;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Как сериализовать?
*/
public class Solution {
    public static class Human implements Serializable {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human1 = new Human("Artur", new Asset("House"));
        FileOutputStream file = new FileOutputStream("/home/artur/file/a");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(human1);
        file.close();
        objectOutputStream.close();

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/home/artur/file/a"))){
            Object someObject = inputStream.readObject();
            System.out.println(((Human) someObject).name);
        }
    }
}
