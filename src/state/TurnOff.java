package state;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 18:19
 * @since JKD 1.8
 */
public class TurnOff extends State {

    @Override
    public void handle(Context context) {
        context.setState(new TurnOn());
    }
}
