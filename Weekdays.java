package arrays;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String week[]=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day [1-7]");
        day=sc.nextInt();
        if (day>7)
            System.out.println("Please enter between 1-7");
        else
        {
            System.out.println("Weekday is "+week[day-1]);
        }
        sc.close();
    }
}
