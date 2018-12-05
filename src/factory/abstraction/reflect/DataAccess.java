package factory.abstraction.reflect;

import factory.abstraction.normal.*;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 17:19
 * @since JKD 1.8
 */
public class DataAccess {

    private static final String DB = "SqlServer";

    public static IUser createUser(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IUser iUser = null;
        String clazzName = beanName + "User";
        Class clazz = Class.forName("factory.abstraction.normal." + clazzName);
        iUser = (IUser) clazz.newInstance();
        return iUser;
    }

    public static IDepartment createDepartment(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IDepartment department = null;
        String clazzName = beanName + "Department";
        Class clazz = Class.forName("factory.abstraction.normal." + clazzName);
        department = (IDepartment) clazz.newInstance();
        return department;
    }
}
