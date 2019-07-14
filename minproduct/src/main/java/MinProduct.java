import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinProduct {

    public static long findMinProduct(int[] arr) {
        assertArrayHasAtLeastTwoElements(arr);
        List<Integer> ints = convertToList(arr);

        Collections.sort(ints);
        return ints.get(0) * ints.get(1);
    }

    private static void assertArrayHasAtLeastTwoElements(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Массив должен содаржать не менее 2 элементов");
        }
    }

    private static List<Integer> convertToList(int[] arr) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer i : arr) {
            result.add(i);
        }
        return result;
    }
}
