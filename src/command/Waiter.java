package command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 17:46
 * @since JKD 1.8
 */
public class Waiter {

    private List<Command> list = new ArrayList<>();

    public void setOrder(Command command) {
        if (command instanceof BakeMuttonCommand) {
            System.out.println("肉串没有了，请选择其他的烧烤");
            return;
        }
        String name = null;
        if (command instanceof BakeMuttonCommand) {
            name = "烤肉串";
        } else {
            name = "烤鸡翅";
        }
        list.add(command);
        System.out.println("日志记录：" + name + " 时间是：" + new Date());
    }

    public void notice() {
        for (Command command : list) {
            command.execute();
        }
    }
}
