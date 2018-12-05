package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/5
 * @since: JDK 1.8
 */
public class ConcreteCompany extends Company{

    private String name;

    private List<Company> list = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
        this.name = name;
    }

    // 增加子公司
    @Override
    public void add(Company company) {
        list.add(company);
    }

    // 删除子公司
    @Override
    public void remove(Company company) {
        list.remove(company);
    }

    // 显示
    @Override
    public void display(int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Company company : list) {
            company.display(dept + 2);
        }
    }

    // 职责
    @Override
    public void lineDuty() {
        for (Company company : list) {
            company.lineDuty();
        }
    }

}
