package principle.openclose;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/4
 * @since: JDK 1.8
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }
}
