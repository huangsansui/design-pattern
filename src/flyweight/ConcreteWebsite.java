package flyweight;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class ConcreteWebsite extends Website{

    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void user(User user) {
        System.out.println("网站分类：" + name + ",使用用户：" + user.getName());
    }
}
