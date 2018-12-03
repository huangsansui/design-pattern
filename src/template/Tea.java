package template;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 18:36
 * @since JKD 1.8
 */
public class Tea extends Beverage {

    @Override
    protected void addCondiments() {
        System.out.println("加入糖");
    }

    @Override
    protected void putIntoCup() {
        System.out.println("将茶叶放入杯中");
    }
}
