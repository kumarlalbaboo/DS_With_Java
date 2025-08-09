package Interview.Practice.SingletonClass;

// Inner class is not loaded until the getInstance method is invoked for the first time

public class LazzyInnerClassSingleton {

    private LazzyInnerClassSingleton(){};

    private static class SingletonHelper {
        private static final LazzyInnerClassSingleton instance = new LazzyInnerClassSingleton();
    }

    public static LazzyInnerClassSingleton getInstance(){
        return SingletonHelper.instance;
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