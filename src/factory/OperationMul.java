package factory;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/11/29 17:01
 * @since JKD 1.8
 */
public class OperationMul extends Operation {
    @Override
    public String getResult() {
        return String.valueOf(getNumberA() * getNumberB());
    }
}
