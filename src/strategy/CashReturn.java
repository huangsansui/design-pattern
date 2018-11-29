package strategy;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class CashReturn extends CashSuper {

    private double meetPrice;

    private double returnPrice;

    public CashReturn(int meetPrice, int returnPrice) {
        this.meetPrice = meetPrice;
        this.returnPrice = returnPrice;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= meetPrice) {
            money -= returnPrice;
        }
        return money;
    }
}
