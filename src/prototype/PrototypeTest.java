package prototype;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/3 16:50
 * @since JKD 1.8
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("sansui");
        resume.setAgeAndSex("22", "男");
        WorkExperience experience = new WorkExperience("2017-12 至 2018-12", "xx公司");
        resume.setWorkExperience(experience);

        Resume resume2 = (Resume) resume.clone();
        WorkExperience experience2 = resume2.getExperience();
        experience2.setCompany("yy公司");
        resume2.setWorkExperience(experience2);

        Resume resume3 = (Resume) resume.clone();
        WorkExperience experience3 = resume3.getExperience();
        experience3.setCompany("zz公司");
        resume2.setWorkExperience(experience2);

        resume.print();
        resume2.print();
        resume3.print();
    }
}
