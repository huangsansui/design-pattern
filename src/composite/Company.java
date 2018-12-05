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
public abstract class Company {

    private String name;

    private static List<Company> list = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    // 增加子公司
    public abstract void add(Company company);

    // 删除子公司
    public abstract void remove(Company company);

    // 显示
    public abstract void display(int dept);

    // 职责
    public abstract void lineDuty();
}
