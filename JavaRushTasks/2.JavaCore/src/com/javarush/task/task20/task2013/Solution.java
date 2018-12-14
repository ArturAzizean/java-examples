package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable{
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public Person(){}

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(mother);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            father = (Person)in.readObject();
            mother = (Person)in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person fother = new Person("Artur", "Azizean", 22);
        List<Person> child = new ArrayList<>();
        child.add(new Person("asd","asd",2));
        fother.setChildren(child);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/home/artur/file/a"));
        outputStream.writeObject(fother);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/home/artur/file/a"));
        Person fother1 = (Person) inputStream.readObject();

        System.out.println(fother1.children.get(0).firstName);

    }
}
