package Interview.Practice.SingletonClass;

public class App {
    public static void main(String[] args) {

        System.out.println("Eager Singleton class");
        EagerSingleton obj1 = EagerSingleton.getInstance();
        System.out.println(obj1.hashCode());

        EagerSingleton obj2 = EagerSingleton.getInstance();
        System.out.println(obj2.hashCode());

        System.out.println("Lazy Singleton class");
        LazySingleton obj3 = LazySingleton.getInstance();
        System.out.println(obj1.hashCode());

        LazySingleton obj4 = LazySingleton.getInstance();
        System.out.println(obj2.hashCode());

        System.out.println("Double check Lazy Singleton class");
        DoubleCheckingLazySingleton obj5 = DoubleCheckingLazySingleton.getInstance();
        System.out.println(obj1.hashCode());

        DoubleCheckingLazySingleton obj6 = DoubleCheckingLazySingleton.getInstance();
        System.out.println(obj2.hashCode());

        System.out.println("Lazy Inner Singleton class");
        LazzyInnerClassSingleton obj7 = LazzyInnerClassSingleton.getInstance();
        System.out.println(obj1.hashCode());

        LazzyInnerClassSingleton obj8 = LazzyInnerClassSingleton.getInstance();
        System.out.println(obj2.hashCode());

    }

}
/*

A Singleton class allows only one instance and provides a global access point to it.
It's commonly used in logging, config management, and database connections to ensure
consistent behavior and resource efficiency.

 */