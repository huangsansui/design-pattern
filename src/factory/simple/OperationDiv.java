package factory.simple;

/**
 * Function: div operator
 *
 * @author Huangqing
 * @date 2018/11/29 17:01
 * @since JKD 1.8
 */
public class OperationDiv extends Operation {
    @Override
    public String getResult() {
        if (getNumberB() == 0) {
            return "除数不能为0";
        }
        return String.valueOf(getNumberA() / getNumberB());
    }
}
