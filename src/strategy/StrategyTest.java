package strategy;

/**
 * Function: test demo
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class StrategyTest {

    public static void main(String[] args) {
        CashContext context = new CashContext(CashEnum.DISCOUNT);
        double unitPrice = context.getResult(200);
        System.out.println(unitPrice);
    }
}
