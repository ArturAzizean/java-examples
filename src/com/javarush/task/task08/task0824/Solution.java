package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> papaArray = new ArrayList<>();
        ArrayList<Human> mamaArray = new ArrayList<>();
        ArrayList<Human> family = new ArrayList<>();

        Human mal = new Human("Малышь 1", true, 14);
        Human mal1 = new Human("Малышь 2", true, 5);
        Human mal2 = new Human("Малышь Girl", false, 4);
        children1.add(mal);
        children1.add(mal1);
        children1.add(mal2);
        family.addAll(children1);
        Human papa = new Human("Artur", true, 28, children1);
        Human mama = new Human("Аня" , false , 24, children1);
        papaArray.add(papa);
        mamaArray.add(mama);
        Human grandFather = new Human("Ded 1", true, 64, papaArray);
        Human grandFather1 = new Human("Ded 2", true, 55, mamaArray);
        Human grandMother = new Human("Bab 1" , false, 64 , papaArray);
        Human grandMother1 = new Human("Bab 2" , false, 55 , mamaArray);
//        for (Human s : family){
//            System.out.println(s);
//        }

        System.out.println(grandFather);
        System.out.println(grandFather1);
        System.out.println(grandMother);
        System.out.println(grandMother1);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(mal);
        System.out.println(mal1);
        System.out.println(mal2);
    }
    public static class Human {
         String name;
         boolean sex;
        int age;
         ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex ,int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

       Human (String name, boolean sex ,int age ,ArrayList<Human> chied ){
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.children = chied;
       }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
