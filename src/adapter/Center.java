package adapter;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 19:11
 * @since JKD 1.8
 */
public class Center extends Player {

    private String name;

    public Center(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("中锋 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋 " + name + " 防守");
    }
}
