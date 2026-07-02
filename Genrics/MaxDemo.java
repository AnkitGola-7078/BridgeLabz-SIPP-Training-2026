class Util {
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) max = item;
        }
        return max;
    }
}

public class MaxDemo {
    public static void main(String[] args) {
        Integer[] nums = {10, 20, 5, 30};
        System.out.println(Util.findMax(nums)); // 30
    }
}
