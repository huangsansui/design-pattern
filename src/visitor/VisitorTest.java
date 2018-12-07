package visitor;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/7
 * @since: JDK 1.8
 */
public class VisitorTest {
    public static void main(String[] args) {

        Man man = new Man();
        Woman woman = new Woman();
        ObjectStructure structure = new ObjectStructure();
        structure.attach(man);
        structure.attach(woman);
        Action success = new Success();
        structure.show(success);
        Action fail = new Failing();
        structure.show(fail);
        Action love = new Love();
        structure.show(love);
    }
}





