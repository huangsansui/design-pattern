package factory.method;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:37
 * @since JKD 1.8
 */
public class FactoryMethondTest {

    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        factory.createLeiFeng().wash();
        factory.createLeiFeng().BuyRice();
        factory.createLeiFeng().sweep();
    }
}
