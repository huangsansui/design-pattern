package factory.method;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:27
 * @since JKD 1.8
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        LeiFeng leiFeng1 = SimpleFactory.createLeiFeng("大学生");
        leiFeng1.wash();
        LeiFeng leiFeng2 = SimpleFactory.createLeiFeng("大学生");
        leiFeng2.sweep();
        LeiFeng leiFeng3 = SimpleFactory.createLeiFeng("大学生");
        leiFeng3.BuyRice();
    }
}
