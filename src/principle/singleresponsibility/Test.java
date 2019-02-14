package principle.singleresponsibility;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        FlyBird bird = new FlyBird();
        bird.moveAction("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.moveAction("鸵鸟");
    }
}
