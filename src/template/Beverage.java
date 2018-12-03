package template;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 18:27
 * @since JKD 1.8
 */
public abstract class Beverage {

    public void prepBeverageTemplate() {

        // 烧水
        boilWater();

        // 放入杯中
        putIntoCup();

        // 加入开水
        addHotWater();

        // 加入添加剂
        addCondiments();
    }

    protected abstract void addCondiments();

    private void addHotWater() {
        System.out.println("加入热水");
    }

    protected abstract void putIntoCup();

    private void boilWater() {
        System.out.println("放入杯中");
    }
}
