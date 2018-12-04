package facade;

/**
 * Function: 基金
 *
 * @author Huangqing
 * @date 2018/12/4 11:57
 * @since JKD 1.8
 */
public class Fund {

    private Stock stock;

    private Realty realty;

    private NationalDebt debt;

    public Fund() {
        stock = new Stock();
        realty = new Realty();
        debt = new NationalDebt();
    }

    public void buy() {
        stock.buy();
        realty.buy();
        debt.buy();
    }

    public void sell() {
        stock.sell();
        realty.sell();
        debt.sell();
    }
}
