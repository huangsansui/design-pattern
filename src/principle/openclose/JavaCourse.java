package principle.openclose;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/4
 * @since: JDK 1.8
 */
public class JavaCourse implements ICourse{

    private Integer id;

    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
