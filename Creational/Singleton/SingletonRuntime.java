package Creational.Singleton;

import java.lang.Runtime;

public class SingletonRuntime {

    public static void main(String[] args) {
        Runtime singletonruntime= Runtime.getRuntime();

        singletonruntime.gc();
        System.out.println(singletonruntime);

        Runtime anotherInstance=Runtime.getRuntime();
        System.out.println(anotherInstance);

        if(anotherInstance==singletonruntime)
            System.out.println("Creational/Singleton");
        else
            System.out.println("Not Creational.Singleton");

    }
}
