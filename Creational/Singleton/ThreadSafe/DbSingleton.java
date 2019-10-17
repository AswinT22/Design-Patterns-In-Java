package Creational.Singleton.ThreadSafe;

public class DbSingleton {





    private static volatile DbSingleton instance=null;

    private DbSingleton(){

        if(instance!=null)
            //Avoid instantiation using reflection
            throw new RuntimeException("Create using getInstance");
    }

    public static DbSingleton getInstance(){

        if(instance==null){
            //Synchronization
            synchronized (DbSingleton.class){

                //Lazy Loaded
                if(instance==null)
                    instance=new DbSingleton();

            }



        }

        return instance;
    }



}
