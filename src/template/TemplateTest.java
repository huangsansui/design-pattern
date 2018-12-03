package template;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 18:37
 * @since JKD 1.8
 */
public class TemplateTest {

    public static void main(String[] args) {
        System.out.println("------泡茶步骤------");
        Beverage tea = new Tea();
        tea.prepBeverageTemplate();
        System.out.println("------泡咖啡步骤------");
        Beverage coffee = new Coffee();
        coffee.prepBeverageTemplate();
    }
}
