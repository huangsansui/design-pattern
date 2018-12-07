package visitor;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/7
 * @since: JDK 1.8
 */
public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
