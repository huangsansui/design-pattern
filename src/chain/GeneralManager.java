package chain;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class GeneralManager extends Manager{


    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestHandle(Request request) {
        if (request.getType().equals("请假") && request.getNumber() <= 10) {
            System.out.println(getName() + "总经理允许" + request.getContent() + request.getNumber() + '天');
        } else {
            System.out.println("请假天数太多，不允许");
        }
    }

    @Override
    public void setSuperior(Manager manager) {
        return;
    }
}
