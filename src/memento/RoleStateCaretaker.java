package memento;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/5
 * @since: JDK 1.8
 */
public class RoleStateCaretaker {


    private RoleMemento memento;

    public RoleMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleMemento memento) {
        this.memento = memento;
    }
}
