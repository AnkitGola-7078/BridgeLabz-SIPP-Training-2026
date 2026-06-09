
public class PalindromNumber {
    public boolean isPalindrome(int x) {
        int or=x;
        int s=0;
        while(x>0){
            int r=x%10;
            s=s*10+r; 
            x=x/10; 
        } 
       
        return s==or?true:false;
    }
    public static void main(String[] args) {
        PalindromNumber palindromNumber = new PalindromNumber();
        int x = 121;
        boolean result = palindromNumber.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome number? " + result);
    }
}