package adapter;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 19:08
 * @since JKD 1.8
 */
public class Forward extends Player {

    private String name;

    public Forward(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("前锋 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋 " + name + " 防守");
    }
}
