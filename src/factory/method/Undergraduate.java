package factory.method;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:04
 * @since JKD 1.8
 */
public class Undergraduate extends LeiFeng {

    @Override
    public void wash() {
        System.out.println("大学生开心的洗碗");
    }

    @Override
    public void sweep() {
        System.out.println("大学生开心的扫地");
    }

    @Override
    public void BuyRice() {
        System.out.println("大学生开心的买米");
    }
}
