package Interview.Practice.SingletonClass;

public class DoubleCheckingLazySingleton {

    private DoubleCheckingLazySingleton(){};

    private static DoubleCheckingLazySingleton instance;

    public static DoubleCheckingLazySingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckingLazySingleton.class) { // 2 object by 2 thread, it leads performance issue,
                if (instance == null) {                          // to avoid this issue, use double check locking
                    instance = new DoubleCheckingLazySingleton();
                }
            }
        }
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