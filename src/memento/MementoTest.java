package memento;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/5
 * @since: JDK 1.8
 */
public class MementoTest {

    public static void main(String[] args) {
        GameRole xiaoming = new GameRole();
        xiaoming.displayState();
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        RoleMemento memento = xiaoming.saveState();
        caretaker.setMemento(memento);
        xiaoming.attackBoss();
        xiaoming.displayState();
        xiaoming.recoverState(memento);
        xiaoming.displayState();
    }
}
