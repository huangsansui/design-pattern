package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2018/12/4 16:05
 * @since JKD 1.8
 */
public class Product {

    private List<String> list = new ArrayList<>();

    public void addPart(String part) {
        list.add(part);
    }

    public void show() {
        list.stream().forEach(s -> System.out.println(s));
    }
}
