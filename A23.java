package assignments;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A23 {

    Scanner sc=new Scanner(System.in);

        public void driver() {
        f3();
    }

    void f1() {
        System.out.println("Enter a size of array:");
        sc.next();
        try {
            int n = sc.nextInt();
            sc.next();
            if (n <= 0)
                throw new ArithmeticException("Enter a number greater than zero");



            double avg = 0;
            int[] arr = new int[n];
            System.out.println("Enter elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                avg = avg + arr[i];
            }
            avg = avg / n;
            System.out.println("Average is " + avg);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            sc.next();
            f1();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");

        }
    }
    void f2()throws InputMismatchException{
        System.out.println("Enter a number ");
        try {
            int n = sc.nextInt();
            if(n<0)
                throw new ArithmeticException("Enter a positive number");
            int fac = 1;
            for (int i = 1; i <= n; i++) {
                fac = fac * i;
            }
            System.out.println("Factorial of " + n + " is " + fac);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            f2();
        }

    }
    void f3(){
            try{
                System.out.print("A");
                int num=10/0;
                System.out.print("B");
            }
            catch (ArithmeticException ex){
                System.out.print("C");
            }
            catch (Exception ex){
                System.out.print("D");

            }
            finally {
                System.out.print("E");
            }
    }
    void f4(){
            try{
                int arr[]={1,2,3,4,5};
                for(int i=0;i<=5;i++){
                    System.out.print("Array elements are:"+arr[i]+"\n");
                }
            }
            catch (Exception e){
                System.out.print("Exception:"+e);
            }

    }

}
