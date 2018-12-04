package builder;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/4 16:17
 * @since JKD 1.8
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilderA();
        director.buildProduct(builder);
        Product p = builder.getProduct();
        p.show();
    }
}
