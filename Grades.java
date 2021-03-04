package arrays;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int num,sum=0,max,min;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of grades you want to give");
        num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Please enter "+ num +" grades");
        for(int i=0;i<num;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            sum = sum + arr[i];
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        avg=sum/num;
        System.out.println("Average is "+ avg);
        System.out.println("Maximum values is "+max);
        System.out.println("Minimum value is "+min);

    }
}
