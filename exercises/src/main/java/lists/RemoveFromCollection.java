package lists;

import java.util.*;

/**
 * Created by: Denis Timofeev
 * Date: 01.06.2019
 */
public class RemoveFromCollection {

    public static void main(String[] args) {
        mapOperations();
        listOperations();
    }

    public static void mapOperations() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> item = iterator.next();
            if (item.getKey() == 1) {
                iterator.remove();
            }
        }

        System.out.println(map);

    }

    public static void listOperations() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();

            if ("a".equals(s)) {
                iterator.remove();
            }
        }
        list.set(2, "xxx");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
