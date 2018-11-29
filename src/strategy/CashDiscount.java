package strategy;

/**
 * Function: a discount to pay
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class CashDiscount extends CashSuper {

    private int discount;

    public CashDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * specific calculator method
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        double realPrice = money * discount / 10;
        return realPrice;
    }
}
