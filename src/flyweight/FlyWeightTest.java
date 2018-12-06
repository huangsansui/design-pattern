package flyweight;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        Website website = factory.getWebsiteCategory("产品展示");
        website.user(new User("建军"));
        website.user(new User("佳哥"));

        Website website1 = factory.getWebsiteCategory("个人博客");
        website1.user(new User("江爷"));
        website1.user(new User("松哥"));

    }
}
