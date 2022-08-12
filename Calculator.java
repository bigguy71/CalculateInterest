/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
import java.util.Scanner;


public class Calculator 
{
    public static double p; //principle
    public static double n; // years
    public static double r; // monthly interest rate
    public static double a; // payment
    public static boolean ptest = false;
    public static boolean ntest = false;
    public static boolean rtest = false;
    
   public static void main(String[]args) 
   {
      inputNumbers(); 
      calculatePayment();
   }
   
   public static void calculatePayment()
   {
     //p (r (1+r)^n) / ( (1+r)^n -1 )
       //A = P (r (1+r)^n) / ( (1+r)^n -1 )
       a = p *((r* Math.pow((1+r),n)) / (Math.pow((1+r),n)-1));
       System.out.println("You have "+n+ " monthly payments");
       
       System.out.println("Your monthly payment is "+a+" over "+n+" months");
       double total = a*n;
       System.out.println("the total cost of the loan is "+total);
       double usury = total - p;
       System.out.println("Your total interet over the loan period is "+usury  );
   }
   
   public static void inputNumbers()
   {
       do
       {
       System.out.println("Please enter the principle greater than zero");
       Scanner sc = new Scanner(System.in);
       p = sc.nextDouble();
       
       if (p > 0 )
       {
          ptest = true; 
       }
       }
       while (ptest == false);
      //System.out.println("The principle is "+ p);
       
       do
       {
        System.out.println("Please enter the years greater than zero");
       Scanner sc = new Scanner(System.in);
       n = sc.nextDouble()*12;
       
       if (n > 0 )
       {
          ntest = true; 
       }
       }
       while (ntest == false);
       //System.out.println("The total monthly payments is "+ " "+ n);
   
   
      do
       {
        System.out.println("Please enter the yearly interest rate greater than zero");
       Scanner sc = new Scanner(System.in);
       r = (sc.nextDouble()/100)/12;
       
       if (r > 0 )
       {
          rtest = true; 
       }
       }
       while (rtest == false);
      // System.out.println("The monthly interest rate is "+ r);
   }
}
