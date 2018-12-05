package adapter;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 19:23
 * @since JKD 1.8
 */
public class ForeignPlayer {

    private String name;

    public ForeignPlayer(String name) {
        this.name = name;
    }

    public void jingong() {
        System.out.println("外籍球员 " + name + " 进攻");
    }

    public void fangshou() {
        System.out.println("外籍球员 " + name + " 防守");
    }
}
