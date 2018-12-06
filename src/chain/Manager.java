package chain;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public abstract class Manager {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public abstract void requestHandle(Request request);

    public abstract void setSuperior(Manager manager);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
