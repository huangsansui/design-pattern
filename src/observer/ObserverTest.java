package observer;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/4
 * @since: JDK 1.8
 */
public class ObserverTest {

    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        NBAObserver nba = new NBAObserver(secretary, "阳阳", "NBA");
        StockObserver stock = new StockObserver(secretary, "黄庆", "股票网页");
        secretary.addObserver(nba);
        secretary.addObserver(stock);
        secretary.removeObserver(nba);
        secretary.setStatus("老板回来了");
        secretary.noticeAll();
    }
}
