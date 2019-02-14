package principle.dependenceinversion;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class WebCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("学习Web课程");
    }
}
