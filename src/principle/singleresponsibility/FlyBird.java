package principle.singleresponsibility;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class FlyBird implements Bird{

    @Override
    public void moveAction(String name) {
        System.out.println(name + "的行走方式是飞行");
    }
}
