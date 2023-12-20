import java.util.*;
public class evenorOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd ?");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is an Even Number");
        }
        else {
            System.out.println(n+" is an Odd Number");
        }
    }
}
