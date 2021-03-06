package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution("/home/artur/file/a");
        solution.writeObject("artur");
        ObjectOutputStream outputStream = new ObjectOutputStream(solution.stream);
        solution.writeObject(outputStream);


        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/home/artur/file/a"));

        Solution solution1 = (Solution) inputStream.readObject() ;
        solution1.writeObject("Kristin");

        System.out.println(solution1);

    }
}
