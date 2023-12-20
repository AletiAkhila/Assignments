import java.util.*;
public class quotient_Remainder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend");
        double x = sc.nextDouble();
        System.out.println("Enter divisor");
        double y = sc.nextDouble();
        double quo = x/y;
        double rem = x%y;
        System.out.println("The quotient is "+quo);
        System.out.println("The remainder is "+rem);
    }
}
