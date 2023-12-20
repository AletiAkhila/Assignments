import java.util.Scanner;

public class fibSeries
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find the fib Series");
        int n=sc.nextInt();
        int x=0;
        int y=1;
        int z;
        System.out.println("Fibonacci Series:");
        System.out.println(x);
        System.out.println(y);
        for(int i=2;i<=n;i++)
        {
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
        }
    }
}
