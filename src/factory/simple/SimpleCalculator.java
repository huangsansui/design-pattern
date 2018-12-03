package factory.simple;

import java.util.Scanner;

/**
 * Function: Simple Calculator
 *
 * @author Huangqing
 * @date 2018/11/29 15:23
 * @since JKD 1.8
 */
public class SimpleCalculator {

    public static void main(String[] args) throws Exception {

        System.out.print("请输入第一个数: ");
        Scanner sc = new Scanner(System.in);
        String inputOne = sc.next();
        System.out.print("请输入第二个数: ");
        String inputTwo = sc.next();
        System.out.print("请输入运算符号: ");
        String operator = sc.next();
        Operation operation = OperationFactory.buildOperation(operator);
        operation.setNumberA(Double.parseDouble(inputOne));
        operation.setNumberB(Double.parseDouble(inputTwo));
        String result = operation.getResult();
        System.out.println("运算结果是: " + result);
    }


}
