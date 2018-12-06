package chain;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class ChainTest {

    public static void main(String[] args) {

        Manager common = new CommonManager("庄周");
        Manager majordomo = new Majordomo("后裔");
        Manager general = new GeneralManager("黄庆");
        common.setSuperior(majordomo);
        majordomo.setSuperior(general);
        Request request = new Request();
        request.setType("请假");
        request.setContent("蔡文姬要请假");
        request.setNumber(3);
        common.requestHandle(request);
    }
}
