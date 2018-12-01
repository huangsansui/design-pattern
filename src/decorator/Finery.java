package decorator;

/**
 * Function: finery class extends person class
 *
 * @author: Huangqing
 * @Date: 2018/11/30
 * @since: JDK 1.8
 */
public  class Finery extends Person{

    private Person person;

    public void decorator(Person person) {
        this.person = person;
    }

    public Finery() {
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
