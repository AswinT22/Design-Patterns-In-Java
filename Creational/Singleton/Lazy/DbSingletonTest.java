package Creational.Singleton.Lazy;

import Creational.Singleton.Static.DbSingleton;

public class DbSingletonTest {

    public static void main(String[] args) {

        DbSingleton instance=DbSingleton.getInstance();

        DbSingleton anotherInstance=DbSingleton.getInstance();

        if(instance==anotherInstance)
            System.out.println("Singleton");
        else
            System.out.println("Not Singleton");
    }
}
