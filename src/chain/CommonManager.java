package chain;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class CommonManager extends Manager{

    private Manager superior;

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestHandle(Request request) {
        if (request.getType().equals("请假") && request.getNumber() <= 2) {
            System.out.println( getName() + "经理允许" + request.getContent() + request.getNumber() + "天");
        } else {
            System.out.println( getName() + "经理" + "没有这个权限");
            superior.requestHandle(request);
        }
    }

    @Override
    public void setSuperior(Manager manager) {
        this.superior = manager;
    }
}
