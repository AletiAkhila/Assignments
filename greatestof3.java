import java.util.*;
public class greatestof3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  3 numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is greater "+ a);
        }
        else if (b>a && b>c)
        {
            System.out.println("B is greater "+ b);
        }
        else if (c > a && c > b)
        {
            System.out.println("C is greater " + c);
        }
        else {
            System.out.println("Two or more numbers are equal and greatest.");
        }
    }
}
