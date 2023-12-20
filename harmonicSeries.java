import java.util.*;
public class harmonicSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Printing Harmonic Series:");
        double sum=0;

        for(int i=1;i<=n;i++)
        {
            sum += 1.0/i;
            if(i==n)
            {
                System.out.print("1/" + i);
            }
            else
            {
            System.out.print("1/"+i+"+");
            }
        }
        System.out.println("\nSum of Harmonic Series up to " + n + " terms: " + sum);
    }
}
