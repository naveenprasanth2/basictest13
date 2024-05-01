package org.example.singleton1;

import java.io.*;

public class SerializableBreak {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ser.ser"));
        objectOutputStream.writeObject(singleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ser.ser"));
        Singleton singleton1 = (Singleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(singleton1.hashCode());
    }
}
