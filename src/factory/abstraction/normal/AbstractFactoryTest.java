package factory.abstraction.normal;

import factory.abstraction.reflect.DataAccess;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:32
 * @since JKD 1.8
 */
public class AbstractFactoryTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        // normal mode
        System.out.println("--------普通抽象工厂--------");
        IDatabaseFactory factory = new SqlServerFactory();
        IUser iUser = factory.createUser();
        User user = new User("1", "sansui");
        iUser.insert(user);
        iUser.get("1");

        IDepartment iDepartment = factory.createDepartment();
        Department department = new Department("1", "技术部");
        iDepartment.insert(department);
        iDepartment.get("1");

        // reflect mode
        System.out.println("--------简单工厂+反射--------");
        String beanName = "SqlServer";
        IUser iUser1 = DataAccess.createUser(beanName);
        iUser1.insert(user);
        iUser1.get("1");
    }
}
