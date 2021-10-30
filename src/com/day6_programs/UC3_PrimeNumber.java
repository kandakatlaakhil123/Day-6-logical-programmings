package com.day6_programs;
import java.util.Scanner;
public class UC3_PrimeNumber {

    void prime(int number) {
        boolean primeNumber=true;
        for(int i=2;i<number;i++) {
            if(number%i==0) {

                primeNumber=false;
                break;
            }

        }
        if(primeNumber==true) {
            System.out.println("IT is a prime Number");
        }
        else {
            System.out.println("IT is not a prime Number");
        }

    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        UC3_PrimeNumber rv=new UC3_PrimeNumber();
        System.out.println("Enter a Number ");
        int number=inp.nextInt();
        rv.prime(number);
    }

}
