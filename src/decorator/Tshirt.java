package decorator;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class Tshirt extends Finery {

    @Override
    public void show() {
        System.out.println("T恤");
        super.show();
    }
}
