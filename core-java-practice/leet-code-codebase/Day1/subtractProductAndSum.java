

class SubtractProductAndSum{
  
    public static void main(String[] args) {
        SubtractProductAndSum spas = new SubtractProductAndSum();
        int n = 234;
        int result = spas.subtractProduct(n);
        System.out.println("The result of subtracting the sum of digits from the product of digits for " + n + " is: " + result);
    }


      public int subtractProduct(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
}