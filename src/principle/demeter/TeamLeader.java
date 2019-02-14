package principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/14
 * @since: JDK 1.8
 */
public class TeamLeader {

    public void checkNumOfCourse() {
        List<Course> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Course());
        }
        System.out.println("课程数量为：" + list.size());
    }
}
