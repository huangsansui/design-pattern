package interpret;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/7
 * @since: JDK 1.8
 */
public class InterpretTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setInput("查看当前目录下的文件");
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }
}
