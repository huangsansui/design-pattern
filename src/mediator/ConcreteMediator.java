package mediator;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class ConcreteMediator extends Mediator {

    private ForeColleague foreColleague;

    private BackColleague backColleague;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague instanceof BackColleague) {
            foreColleague.notice(message);
        } else if (colleague instanceof ForeColleague) {
            backColleague.notice(message);
        }
    }

    public ForeColleague getForeColleague() {
        return foreColleague;
    }

    public void setForeColleague(ForeColleague foreColleague) {
        this.foreColleague = foreColleague;
    }

    public BackColleague getBackColleague() {
        return backColleague;
    }

    public void setBackColleague(BackColleague backColleague) {
        this.backColleague = backColleague;
    }
}
