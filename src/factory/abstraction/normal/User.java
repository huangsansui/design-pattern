package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:36
 * @since JKD 1.8
 */
public class User {

    private String id;

    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
