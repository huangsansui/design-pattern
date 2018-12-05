package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:28
 * @since JKD 1.8
 */
public class MySqlUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在MySQL中插入了一条User数据，id = " + user.getId() + ", name = " + user.getName());
    }

    @Override
    public User get(String id) {
        System.out.println("在MySQL中取到了一条User数据");
        return null;
    }
}
