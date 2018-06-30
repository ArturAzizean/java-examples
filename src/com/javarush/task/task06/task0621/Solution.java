package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String nul = null;
        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName);

        String babName = reader.readLine();
        Cat catBab = new Cat(babName);

        String papaName = reader.readLine();
        Cat catPapa = new Cat(papaName,catDad, nul );

        String mamaName = reader.readLine();
        Cat catMama = new Cat(mamaName,catBab);

        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName,catMama, catPapa);

        String doughterName = reader.readLine();
        Cat catDoughter = new Cat(doughterName,catMama, catPapa);



        System.out.println(catDad);
        System.out.println(catBab);
        System.out.println(catPapa);
        System.out.println(catMama);
        System.out.println(catSun);
        System.out.println(catDoughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMama;
        private Cat parentPapa;
        private String noli;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMama) {
            this.name = name;
            this.parentMama = parentMama;
        }

        Cat(String name, Cat parentPapa, String noli) {
            this.name = name;
            this.parentPapa = parentPapa;
            this.noli = noli;
        }
        Cat(String name, Cat parentMama, Cat parentPapa) {
            this.name = name;
            this.parentMama = parentMama;
            this.parentPapa = parentPapa;
        }

        @Override
        public String toString() {
            if (parentMama == null&& parentPapa == null) {
                return "Cat name is " + name + ", no mother," + " no father";
            }else if (parentMama == null && noli == null) {
                return "Cat name is " + name + ", no mother," + " father is " + parentPapa.name;
            }else if (parentPapa == null) {
                return "Cat name is " + name + ", mother is " + parentMama.name + " no father";
            }else return "Cat name is " + name + ", mother is " + parentMama.name + " father is " + parentPapa.name;

        }
    }

}
