package visitor;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/7
 * @since: JDK 1.8
 */
public class Failing extends Action{
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人失败时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人失败时，泪眼汪汪，谁也劝不了");
    }
}
