package prototype;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 17:11
 * @since JKD 1.8
 */
public class WorkExperience implements Cloneable{

    private String timeArea;

    private String company;

    public WorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
