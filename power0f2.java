import java.util.*;
public class power0f2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int value =1;
        for(int i=0;i<=num;i++)
        {
            System.out.println(" 2^ "+ i+" = "+ value);
            value *= 2;
        }
    }
}
