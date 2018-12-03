package factory.method;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:23
 * @since JKD 1.8
 */
public class SimpleFactory {

    private static LeiFeng leiFeng;

    public static LeiFeng createLeiFeng(String type) {
        switch (type) {
            case "大学生":
                leiFeng = new Undergraduate();
                break;
            case "志愿者":
                leiFeng = new Volunteer();
                break;
            default: break;
        }
        return leiFeng;
    }
}
