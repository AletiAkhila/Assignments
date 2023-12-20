import java.util.*;
public class factors
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factors for it");
        int numb = sc.nextInt();
        System.out.println("The factors of "+ numb+ " are");
        for(int i=1;i<=numb;i++)
        {
            int rem = numb%i;
            if(rem ==0)
            {
                System.out.print(i+" , ");
            }
        }
    }
}
