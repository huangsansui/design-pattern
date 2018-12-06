package singleton;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 16:14
 * @since JKD 1.8
 */
public enum  EnumSingleton {

    INSTANCE;

    private EnumSingleton() {

    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
