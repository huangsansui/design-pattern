package singleton;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 15:16
 * @since JKD 1.8
 */
public class SingletonTest {

    public static void main(String[] args) {

        // 饿汉模式
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        if (hungrySingleton1 == hungrySingleton2) {
            System.out.println("饿汉模式");
        }

        // 饿汉模式 (多线程下不安全)
        ExecutorService executor = Executors.newFixedThreadPool(100);
        HashSet<LazySingleton> set = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            executor.execute(() ->{
                LazySingleton singleton = LazySingleton.getInstance();
                set.add(singleton);
            });
        }
        for (LazySingleton singleton : set) {
            System.out.println(singleton);
        }

        // 静态内部类
        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();
        if (innerClassSingleton1 == innerClassSingleton2) {
            System.out.println("静态内部类单例模式");
        }

        // 枚举
        EnumSingleton instance1 = EnumSingleton.getInstance();
        EnumSingleton instance2 = EnumSingleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("枚举实现单例模式");
        }
    }
}
