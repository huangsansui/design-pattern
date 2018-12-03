package factory.method;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:34
 * @since JKD 1.8
 */
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
