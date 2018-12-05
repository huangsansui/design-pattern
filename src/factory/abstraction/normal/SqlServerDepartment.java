package factory.abstraction.normal;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/5 16:52
 * @since JKD 1.8
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SqlServer中插入了一条Department数据，id = " + department.getId() + ", name = " + department.getName());
    }

    @Override
    public Department get(String id) {
        System.out.println("在SqlServer中取到了一条Department数据");
        return null;
    }
}
