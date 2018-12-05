package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:26
 * @since JKD 1.8
 */
public class MySqlFactory implements IDatabaseFactory {

    @Override
    public IUser createUser() {
        return new MySqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MySqlDepartment();
    }
}
