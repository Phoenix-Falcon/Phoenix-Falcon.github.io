import java.util.Scanner;
import java.util.*;
public class Time{

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter mins:");
        int m=scan.nextInt();
        scan.close();
        int day =m/1440;
        System.out.println("No of days:"+day);
        int hr=m/60;
        System.out.println("Hours:"+hr);


    }
}
