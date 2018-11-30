package factory;

/**
 * Function: abstract operation class
 *
 * @author Huangqing
 * @date 2018/11/29 16:04
 * @since JKD 1.8
 */
public abstract class Operation {

    private double numberA = 0;

    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract String getResult();

}
