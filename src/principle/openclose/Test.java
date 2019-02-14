package principle.openclose;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/2/4
 * @since: JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(91, "Java并发编程艺术", 78d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) course;
        System.out.println("课程id: " + discountCourse.getId() + " 课程名称: " + discountCourse.getName()
                + " 课程原价: "+ discountCourse.getOriginPrice() + " 课程价格: " + discountCourse.getPrice());
    }
}
