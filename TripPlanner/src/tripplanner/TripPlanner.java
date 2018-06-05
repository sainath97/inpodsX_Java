/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripplanner;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class TripPlanner {
    
    public static void main(String args[]){
        intro();
        budget();
        time();
        distance();
    }
    
    private static void intro() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name=sc.nextLine();
        System.out.print("Nice to meet you "+name+", Where are you travelling to? ");
        String place=sc.nextLine();
        System.out.println("Great! "+place+" sounds like a great trip");
        System.out.println("************\n\n");
    }

    private static void budget() {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days=sc.nextInt();
        sc.nextLine();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money=sc.nextInt();
        sc.nextLine();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol=sc.nextLine();
        System.out.print("How many "+symbol+" are there in 1 USD? ");
        double many=sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println("If you are travelling for "+days+" days that is the same as "+days*24+" hours or "+days*24*60+" minutes");
        double perDay=money/(double)days;
        int temp=(int)(perDay*100);
        perDay=(double)temp/100;
        System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+perDay+" USD");
        double budget=money*many;
        int temp2=(int)(budget*100);
        budget=(double)temp2/100;
        double budgetPerDay=budget/(double)days;
        int temp3=(int)(budgetPerDay*100);
        budgetPerDay=(double)temp3/100;
        System.out.println("Your total budget in "+symbol+" is "+budget+" "+symbol+", which per day is "+budgetPerDay+" "+symbol);
        System.out.println("************\n\n");
    }

    private static void time() {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and destination? ");
        int timeDiff=sc.nextInt();
        sc.nextLine();
        System.out.println("That means that when it is midnight at home it will be "+(timeDiff%24)+":00 in your travel destination");
        System.out.println("and it is noon at home it will be "+((12+timeDiff)%24)+":00");
        System.out.println("************\n\n");
    }

    private static void distance() {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is the square area of your destination in km2? ");
        int km=sc.nextInt();
        sc.nextLine();
        double miles=(double)km*0.62137*0.62137;
        int temp=(int)(miles*100);
        miles=(double)temp/100;
        System.out.println("In miles2 that is "+miles);
        System.out.println("************\n\n");
    }
    
}
