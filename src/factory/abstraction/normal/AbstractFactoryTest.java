package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:32
 * @since JKD 1.8
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IDatabaseFactory factory = new SqlServerFactory();
        IUser iUser = factory.createUser();
        User user = new User("1", "sansui");
        iUser.insert(user);
        iUser.get("1");

        IDepartment iDepartment = factory.createDepartment();
        Department department = new Department("1", "技术部");
        iDepartment.insert(department);
        iDepartment.get("1");
    }
}
