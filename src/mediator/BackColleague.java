package mediator;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class BackColleague extends Colleague {

    public BackColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notice(String message) {
        System.out.println("后端接受到消息:" + message);
    }

    public void send(String message) {
        getMediator().send(message, this);
    }
}
