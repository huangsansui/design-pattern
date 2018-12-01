package decorator;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Person person = new Person("黄三岁");
        Tshirt tShit = new Tshirt();
        BigTrouser bt = new BigTrouser();
        tShit.decorator(person);
        bt.decorator(tShit);
        bt.show();
    }
}
