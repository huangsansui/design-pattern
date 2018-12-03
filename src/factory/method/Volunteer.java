package factory.method;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:22
 * @since JKD 1.8
 */
public class Volunteer extends LeiFeng {

    @Override
    public void wash() {
        System.out.println("社区志愿者卖力的洗碗");
    }

    @Override
    public void sweep() {
        System.out.println("社区志愿者卖力的扫地");
    }

    @Override
    public void BuyRice() {
        System.out.println("社区志愿者卖力的买米");
    }
}
