package facade;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/4 11:59
 * @since JKD 1.8
 */
public class FacadeTest {

    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}
