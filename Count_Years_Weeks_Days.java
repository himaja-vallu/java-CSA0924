//Calculate No of Years, Days, Weeks from given no of days
// Assignment 1 Q-5

import java.util.*;
class DaystoYearsWeeksDays{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int noofdays, years, weeks, days, rdays;
        System.out.print("Enter No of Days:");
        noofdays=s.nextInt();
        if(noofdays<0)
        {
            System.out.print("Enter valid No of Days");
        }
        else if(noofdays>=0) {
            years = noofdays/365;
            rdays = noofdays%365;
            weeks = rdays/7;
            days = rdays%7;
            System.out.println("No of Years is : "+years);
            System.out.println("No of Weeks is :"+weeks);
            System.out.println("No of Days is :"+days);
        }
    }
}
