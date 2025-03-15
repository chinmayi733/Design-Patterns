package org.example.Singleton;

public class SingletonDesignPattern{

    private static SingletonDesignPattern singleton ;

    private  SingletonDesignPattern() {
    }


//    //lazyinitialization
    public static SingletonDesignPattern getSingleton()
    {
//            //doublelock
            if (singleton == null) {
                synchronized (SingletonDesignPattern.class) {
                    if(singleton==null)
                        singleton = new SingletonDesignPattern();
            }
        }

            return singleton;
    }

}