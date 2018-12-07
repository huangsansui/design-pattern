package interpret;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/7
 * @since: JDK 1.8
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        if (context.getInput().equals("查看当前目录下的文件")) {
            System.out.println("终端解释器" + " 命令 ls");
        }
    }
}
