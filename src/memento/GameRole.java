package memento;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/5
 * @since: JDK 1.8
 */
public class GameRole {

    // 生命力
    private int vik;

    // 攻击力
    private int atk;

    // 防御力
    private int def;

    public GameRole() {
        this.vik = 100;
        this.atk = 100;
        this.def = 100;
    }

    // 保存状态
    public RoleMemento saveState() {
        return new RoleMemento(this.vik, this.atk, this.def);
    }

    // 查看状态
    public void displayState() {
        System.out.println(this.vik);
        System.out.println(this.atk);
        System.out.println(this.def);
    }

    // 攻击boss
    public void attackBoss() {
        this.vik = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 恢复存档
    public void recoverState(RoleMemento memento) {
        this.vik = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}
