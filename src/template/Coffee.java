package template;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 18:35
 * @since JKD 1.8
 */
public class Coffee extends Beverage {

    @Override
    protected void addCondiments() {
        System.out.println("添加糖和牛奶");
    }

    @Override
    protected void putIntoCup() {
        System.out.println("将咖啡加入杯中");
    }
}
