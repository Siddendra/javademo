package com.sidd.javademo.application.designpattern.singleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instance = SerializedSingleton.getInstance();
        FileOutputStream fileOutputStream = new FileOutputStream("filename.ser");
        ObjectOutput out = new ObjectOutputStream(fileOutputStream);
        out.writeObject(instance);
        out.close();

        //Deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        System.out.println("Instance one : "+ instance.hashCode());
        System.out.println("Instance Two : "+ instanceTwo.hashCode());
    }
}
