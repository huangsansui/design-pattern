package principle.dependenceinversion;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
