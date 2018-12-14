package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable,Runnable{
    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Пора спать Диме "+ i);
        }
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Thread thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution(3);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/home/artur/file/a"));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/home/artur/file/a"));

        outputStream.writeObject(solution);
        outputStream.close();

        Solution solution1 = (Solution) inputStream.readObject();

    }
}
