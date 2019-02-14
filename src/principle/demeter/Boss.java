package principle.demeter;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class Boss {

    public void commandCheckCoueseNumber(TeamLeader teamLeader) {
        teamLeader.checkNumOfCourse();
    }
}
