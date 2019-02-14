package principle.dependenceinversion;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        Sansui sansui = new Sansui();
        sansui.studyCourse(new JavaCourse());
        sansui.studyCourse(new WebCourse());
    }
}
