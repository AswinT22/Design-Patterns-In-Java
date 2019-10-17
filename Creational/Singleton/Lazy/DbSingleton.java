package Creational.Singleton.Lazy;

public class DbSingleton {


    private DbSingleton(){}


    private static DbSingleton instance=null;

    public static DbSingleton getInstance(){

        //LAZY LOADED
        if(instance==null)
            instance=new DbSingleton();
        return instance;
    }



}
