package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/6
 * @since: JDK 1.8
 */
public class WebsiteFactory {

    private Map<String, Website> hashMap = new HashMap();

    public Website getWebsiteCategory(String category) {
        if (!hashMap.containsKey(category)) {
            hashMap.put(category, new ConcreteWebsite(category));
        }
        return hashMap.get(category);
    }
}
