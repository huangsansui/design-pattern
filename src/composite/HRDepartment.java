package composite;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/5
 * @since: JDK 1.8
 */
public class HRDepartment extends Company {

    private String name;

    public HRDepartment(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineDuty() {
        System.out.println(name + " 负责人力资源管理");
    }
}
