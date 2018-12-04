package builder;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/4 16:10
 * @since JKD 1.8
 */
public class Director {

    public void buildProduct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
