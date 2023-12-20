import java.util.*;
public class employeeWage
{
    static final int wageperhour=20;
    static final int fullDayHours = 8;
    static final int parttimehours=4;
    static final int workingdaypermonth = 20;
    static final int maxworkinghours = 100;
    static final int maxworkingdays=20;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee wage Portal!!");
        int total_hours =0;
        int total_wages=0;
        int total_days=0;
        Random ran = new Random();
        while(total_hours<maxworkinghours && total_days<maxworkingdays)
        {
            int empcheck = ran.nextInt(3);
            switch (empcheck)
            {
                case 0 :
                    break;
                case 1:
                    total_wages += calculateWage(fullDayHours);
                    total_hours += fullDayHours;
                    break;
                case 2:
                    total_wages += calculateWage(parttimehours);
                    total_hours += parttimehours;
                    break;
                default:
                    break;
            }
            total_days++;
        }
        System.out.println("Total wage for the month: " + total_wages);
        System.out.println("Total working days: " + total_days);
        System.out.println("Total working hours: " + total_hours);

    }
    static int calculateWage(int hours)
    {
        return hours * wageperhour;
    }

}
