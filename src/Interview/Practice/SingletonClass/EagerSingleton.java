package Interview.Practice.SingletonClass;

// Instance is created at the time of class loading

public class EagerSingleton {
    private EagerSingleton(){};

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return instance;
    }

}

/*

A Singleton class allows only one instance and provides a global access point to it.
It's commonly used in logging, config management, and database connections to ensure
consistent behavior and resource efficiency.

✅ Key Points:
Private constructor – prevents external instantiation.
Static instance – holds the single object.
Public method – returns the instance.

 */