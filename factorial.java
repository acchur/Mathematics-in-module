import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = factorial(num);
        System.out.println(answer);
    }
    public static int factorial(int num){
        int fact=1;
        if(num==0){
            return 1;
        }
        else{

            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
        }
        return fact;
    }
}

