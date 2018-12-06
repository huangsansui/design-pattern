package singleton;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 15:49
 * @since JKD 1.8
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {

    }

    public static class InnerClass{
        private static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.singleton;
    }
}
