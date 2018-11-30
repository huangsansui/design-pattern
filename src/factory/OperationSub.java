package factory;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/11/29 17:00
 * @since JKD 1.8
 */
public class OperationSub extends Operation {

    @Override
    public String getResult() {
        return String.valueOf(getNumberA() - getNumberB());
    }
}
