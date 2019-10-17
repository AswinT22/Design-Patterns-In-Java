package Creational.Singleton.Static;

public class DbSingleton {


    private DbSingleton(){}

    //EAGERLY LOADED
    private static DbSingleton instance=new DbSingleton();

    public static DbSingleton getInstance(){
        return instance;
    }



}
