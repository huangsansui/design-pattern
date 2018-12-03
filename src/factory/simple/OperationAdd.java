package factory.simple;

/**
 * Function: add operation
 *
 * @author Huangqing
 * @date 2018/11/29 16:49
 * @since JKD 1.8
 */
public class OperationAdd extends Operation {

    @Override
    public String getResult() {
        return String.valueOf(getNumberA() + getNumberB());
    }
}
