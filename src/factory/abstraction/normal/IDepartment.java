package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:52
 * @since JKD 1.8
 */
public interface IDepartment {

    void insert(Department department);

    Department get(String id);
}
