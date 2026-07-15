public class ArithmeticException {
    public static void main(String[] args) {
        /*int a=50;
        int b=0;
        System.out.println(a/b);*/


        //handle arthmetic exception
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
