package composite;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/5
 * @since: JDK 1.8
 */
public class CompositeTest {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        FinanceDepartment financeDepartment = new FinanceDepartment("北京财务部");
        HRDepartment hrDepartment = new HRDepartment("北京人力部");
        root.add(financeDepartment);
        root.add(hrDepartment);

        ConcreteCompany child = new ConcreteCompany("杭州分公司");
        FinanceDepartment childFinance = new FinanceDepartment("杭州分公司财务部");
        child.add(childFinance);
        root.add(child);
        root.display(1);
        root.lineDuty();
    }
}
