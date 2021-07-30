import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = isperfectNumber(num);
        boolean isperfect=false;
        if(result == 1)
            isperfect = true;
        System.out.println(isperfect);
    }
    public static int isperfectNumber(int num){
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                if(i*i!=num)
                    sum=sum+i+num/i;
                else
                    sum=sum+i;
            }
        }
        return sum;
    }
}
