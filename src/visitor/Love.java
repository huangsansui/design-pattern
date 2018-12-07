package visitor;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/7
 * @since: JDK 1.8
 */
public class Love extends Action{
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人恋爱时，凡事不懂也要装懂");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人恋爱时，遇事懂也要装不懂");
    }
}
