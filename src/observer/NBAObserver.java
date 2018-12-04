package observer;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/4
 * @since: JDK 1.8
 */
public class NBAObserver extends Observer {

    private String name;

    private String interest;

    private Secretary subject;

    private String status;

    public NBAObserver(Secretary subject, String name, String interest) {
        this.subject = subject;
        this.name = name;
        this.interest = interest;
    }

    @Override
    public void update() {
        String status = subject.getStatus();
        System.out.println(status + "," + name + "赶紧关掉" + interest);
    }

}
