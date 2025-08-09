package Interview.Practice.SingletonClass;

public class LazySingleton {

    private LazySingleton(){};

    private static LazySingleton instance;

    //Avoid race condition used synchronized keyword
    public static synchronized LazySingleton getInstance(){
        if(instance==null){
            return instance = new LazySingleton();  // 2 object by 2 thread, it leads performance issue,
                                                    // to avoid this issue, use double check locking
        } else {
            return instance;
        }
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