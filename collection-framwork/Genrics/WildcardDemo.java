class Printer {
    public static void printList(java.util.List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        java.util.List<Integer> nums = java.util.Arrays.asList(1, 2, 3);
        Printer.printList(nums);
    }
}
