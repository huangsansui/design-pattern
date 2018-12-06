package singleton;

/**
 * Function: 饿汉模式
 *
 * @author Huangqing
 * @date 2018/12/6 15:16
 * @since JKD 1.8
 */
public class HungrySingleton {

    // 私有静态成员变量
    private static final HungrySingleton singleton = new HungrySingleton();

    // 私有构造方法
    private HungrySingleton() {
    }

    // 静态公开方法
    public static HungrySingleton getInstance() {
        return singleton;
    }
}
