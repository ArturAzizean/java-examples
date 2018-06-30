package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather = new Human("Bob", true, 65);
        Human dedushka = new Human("Jonn", true, 55);
        Human grandMother = new Human("Anny", false, 67);
        Human babushka = new Human("Maia", false, 58);
        Human father = new Human("Martin", true, 35,grandFather , grandMother);
        Human mother = new Human("Maria", false, 29 , dedushka,babushka);
        Human son = new Human("Antony", true, 15, father , mother );
        Human ssinok = new Human("Smith", true, 25, father, mother);
        Human dother = new Human("Liza", false, 13, father, mother);

        //напишите тут ваш код
        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(dedushka);
        System.out.println(babushka);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(ssinok);
        System.out.println(dother);
    }

    public static class Human {
        String name ;
        boolean sex ;
        int age ;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















