package Creational.Singleton.StaticClass;

public class DbSingleton {


    private DbSingleton(){}

    private static DbSingleton instance=new DbSingleton();

    public static DbSingleton getInstance(){
        return instance;
    }



}
