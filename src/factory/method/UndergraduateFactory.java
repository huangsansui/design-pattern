package factory.method;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:33
 * @since JKD 1.8
 */
public class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
