package command;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 17:39
 * @since JKD 1.8
 */
public class BakeMuttonCommand implements Command {

    private Barbecuer barbecuer;

    public BakeMuttonCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void execute() {
        barbecuer.bakeMutton();
    }
}
