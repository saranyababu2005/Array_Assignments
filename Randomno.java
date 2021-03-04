package arrays;

import java.util.Random;
import java.util.Scanner;

public class Randomno {
    public static void main(String[] args) {
        int num=0,digit;
        String format="MH",carno;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many times do you want to generate random number");
        Random rand=new Random();
        num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            digit=rand.nextInt(9999);
            if(digit<1000)
            {
                digit=digit+1000;
            }
            carno= format+digit;
            System.out.println("Car Number "+carno);
        }
        sc.close();
    }
}
