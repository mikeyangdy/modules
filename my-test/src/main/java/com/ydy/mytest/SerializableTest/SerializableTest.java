package com.ydy.mytest.SerializableTest;

import java.io.*;



/**
 *@Author yangduyu
 *@Date 2020/11/16
 *@Description 序列化测试
 */
public class SerializableTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        xlh();

        fxl();
    }

    private static void xlh() throws IOException {
        Student s = new Student();
        s.setId(1);
        s.setName("admin");

        ObjectOutputStream  out = new ObjectOutputStream(new FileOutputStream("D:/1.txt"));
        out.writeObject(s);
        out.close();
    }

    private static void fxl() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/1.txt"));
        Student s = (Student) in.readObject();
        System.out.println(s.toString());
    }
}
