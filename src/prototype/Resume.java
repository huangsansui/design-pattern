package prototype;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:46
 * @since JKD 1.8
 */
public class Resume implements Cloneable{

    private String name;

    private String age;

    private String sex;

    private WorkExperience experience;


    public Resume(String name) {
        this.name = name;
    }

    /**
     * set age and sex
     */
    public void setAgeAndSex(String age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    /**
     * set time area and company
     */
    public void setWorkExperience(WorkExperience experience) {
        this.experience = experience;
    }

    public WorkExperience getExperience() {
        return experience;
    }

    public void print() {
        System.out.println("姓名：" + name + "  年龄: " + age + "  性别：" + sex);
        System.out.println("工作经历： " + experience.getTimeArea() + "  任职公司:" + experience.getCompany());
    }

    /**
     * if the object has other object reference
     * rewrite clone
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume resume = (Resume)super.clone();
        experience = (WorkExperience) experience.clone();
        return resume;
    }
}
