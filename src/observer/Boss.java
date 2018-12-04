package observer;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/4
 * @since: JDK 1.8
 */
public class Boss extends Subject {

    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
