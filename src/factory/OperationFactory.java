package factory;

/**
 * Function: factory create a specific operator method
 *
 * @author Huangqing
 * @date 2018/11/29 17:29
 * @since JKD 1.8
 */
public class OperationFactory {

    public static Operation buildOperation(String type) throws Exception {
        switch (type) {
            case "+": return new OperationAdd();
            case "-": return new OperationSub();
            case "*": return new OperationMul();
            case "/": return new OperationDiv();
            default : throw new Exception();
        }
    }
}
