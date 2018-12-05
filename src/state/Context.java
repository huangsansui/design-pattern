package state;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 18:14
 * @since JKD 1.8
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        if (state instanceof TurnOn) {
            System.out.println("我是TurnOn");
        } else if (state instanceof TurnOff) {
            System.out.println("我是TurnOff");
        }
        this.state = state;
    }
}
