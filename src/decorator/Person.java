package decorator;

/**
 * Function: the person class
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void show() {
        System.out.println("进行装扮的" + name);
    }
}
