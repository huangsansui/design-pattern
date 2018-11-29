package strategy;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class CashContext {

    private CashSuper cs = null;

    public CashContext(CashEnum cashEnum) {
        switch (cashEnum) {
            case NORMAL:
                cs = new CashNormal();
                break;
            // 打8折
            case DISCOUNT:
                cs = new CashDiscount(8);
                break;
            // 满200减20
            case RETURN:
                cs = new CashReturn(200, 20);
                break;
            default: break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
