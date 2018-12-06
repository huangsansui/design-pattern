package command;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 17:49
 * @since JKD 1.8
 */
public class CommandTest {

    public static void main(String[] args) {

        Barbecuer cooker = new Barbecuer();
        Waiter waiter = new Waiter();
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand(cooker);
        BakeChickenWingCommand bakeChickenWingCommand = new BakeChickenWingCommand(cooker);

        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.notice();
    }
}
