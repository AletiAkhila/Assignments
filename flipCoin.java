import java.util.*;
public class flipCoin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times to flip coin");
        int flips = sc.nextInt();
        if (flips > 0)
        {
            int heads = 0;
            int tails = 0;
            Random ran = new Random();
            for (int i = 0; i < flips; i++)
            {
                double flipresult = ran.nextDouble();
                if (flipresult < 0.5)
                {
                    heads++;
                } else
                {
                    tails++;
                }
            }
            double headPercentage = (double) heads / flips * 100;
            double tailPercentage = (double) tails / flips * 100;

            System.out.println("Heads % : " + headPercentage);
            System.out.println("Tails % : " + tailPercentage);
        }
        else
        {
            System.out.println("Please enter a positive integer for the number of flips.");
        }
        sc.close();
    }

}

