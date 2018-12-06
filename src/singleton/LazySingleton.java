package singleton;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 15:26
 * @since JKD 1.8
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }

        }
        return lazySingleton;
    }
}
