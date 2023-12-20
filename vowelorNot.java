import java.util.*;
public class vowelorNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        char aa = sc.next().charAt(0);
        if(aa =='a' || aa == 'e' || aa== 'i' || aa == 'o' || aa =='u' ||
                aa =='A' || aa == 'E' || aa== 'I' || aa == 'O' || aa =='U') {
            System.out.println(aa+" is a vowel");
        } else {
            System.out.println(aa + " is  a consonant");
        }
    }
}
