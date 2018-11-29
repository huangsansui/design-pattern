package strategy;

/**
 * Function: the original price
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class CashNormal extends CashSuper {

    /**
     * specific calculator method
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
