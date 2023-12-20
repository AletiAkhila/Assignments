import java.util.*;
public class revNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int rev=0;
        int rem=0;
        while(number>0)
        {
            rem = number%10;
            rev=rev*10+rem;
            number = number/10;
        }
        System.out.println("Reverse Number is "+ rev);
    }
}
