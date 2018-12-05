package adapter;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 19:12
 * @since JKD 1.8
 */
public class Guard extends Player {

    private String name;

    public Guard(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("后卫 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫 " + name + " 防守");
    }
}
