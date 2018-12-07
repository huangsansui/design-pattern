package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/7
 * @since: JDK 1.8
 */
public class ObjectStructure {

    private List<Person> list = new ArrayList<>();

    public void attach(Person person) {
        list.add(person);
    }

    public void detach(Person person) {
        list.remove(person);
    }

    public void show(Action action) {
        for (Person person : list) {
            person.accept(action);
        }
    }
}
