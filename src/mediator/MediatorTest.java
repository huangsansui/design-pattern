package mediator;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class MediatorTest {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        BackColleague back = new BackColleague(mediator);
        ForeColleague fore = new ForeColleague(mediator);
        mediator.setForeColleague(fore);
        mediator.setBackColleague(back);
        fore.send("你好，我是前端小姐姐");
        back.send("嘿嘿，我是后端小哥哥");
    }
}

