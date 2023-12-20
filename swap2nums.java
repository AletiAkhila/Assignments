import java.util.*;
public class swap2nums
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for swaping");
        int x= sc.nextInt();
        int y =sc.nextInt();
        System.out.println("Before swaping x="+x+" y="+y);
        int temp = x;
        x=y;
        y=temp;
        System.out.println("After swaping x="+x+" y="+y);
    }
}
