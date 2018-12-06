package mediator;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);
}
