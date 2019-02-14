package principle.dependenceinversion;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class Sansui {

    public void studyCourse(ICourse course) {
        course.studyCourse();
    }
}
