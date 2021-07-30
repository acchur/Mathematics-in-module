import java.util.Scanner;

public class palendromeNumber {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int result = palindrome(num);
   boolean ispalindrome=false;
   if(result == num)
       ispalindrome = true;
       System.out.println(ispalindrome);
    }
   public static int palindrome(int num){
      int r,sum=0;
      while(num !=0){
          r=num%10;
          sum=(sum*10)+r;
          num=num/10;
      }
      return sum;
   }
}
