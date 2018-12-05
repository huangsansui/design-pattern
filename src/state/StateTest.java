package state;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 18:21
 * @since JKD 1.8
 */
public class StateTest {

    public static void main(String[] args) {
        Context context = new Context(new TurnOn());
        context.request();
        context.request();
    }
}
