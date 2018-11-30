package factory;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/11/29 17:29
 * @since JKD 1.8
 */
public class OperationFactory {

    public static Operation buildOperation(String operator) throws Exception {
        switch (operator) {
            case "+": return new OperationAdd();
            case "-": return new OperationSub();
            case "*": return new OperationMul();
            case "/": return new OperationDiv();
            default : throw new Exception();
        }
    }
}
