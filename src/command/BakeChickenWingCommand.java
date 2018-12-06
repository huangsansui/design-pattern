package command;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 17:40
 * @since JKD 1.8
 */
public class BakeChickenWingCommand implements Command {

    private Barbecuer barbecuer;

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        barbecuer.bakeChickenWing();
    }
}
