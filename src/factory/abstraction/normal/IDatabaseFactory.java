package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 15:19
 * @since JKD 1.8
 */
public interface IDatabaseFactory {

    IUser createUser();

    IDepartment createDepartment();
}
