package builder;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/4 16:07
 * @since JKD 1.8
 */
public class ConcreteBuilderA extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("A公司A部件");
    }

    @Override
    public void buildPartB() {
        product.addPart("A公司B部件");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
