package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:27
 * @since JKD 1.8
 */
public interface IUser {

    void insert(User user);

    User get(String id);
}
