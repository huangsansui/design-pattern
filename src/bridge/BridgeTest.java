package bridge;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 17:06
 * @since JKD 1.8
 */
public class BridgeTest {
    public static void main(String[] args) {
        AppleMobile appleMobile = new AppleMobile("苹果手机");
        appleMobile.setSoft(new Game());
        appleMobile.run();

        AndroidMobile androidMobile = new AndroidMobile("安卓手机");
        androidMobile.setSoft(new Game());
        androidMobile.run();
    }
}
