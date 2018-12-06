package bridge;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/6 16:56
 * @since JKD 1.8
 */
public abstract class MobileBrand {

    private MobileSoft soft;

    private String brand;

    public MobileBrand(String brand) {
        this.brand = brand;
    }

    public void setSoft(MobileSoft soft) {
        this.soft = soft;
    }

    public void run() {
        System.out.print(brand);
        soft.run();
    }
}
