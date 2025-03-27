package myPackage;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.print(" Enter the nth number: ");
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int a=0, b=1;
        int temp;
        int index=2;
        while(index<=n){
            temp=b;
            b+=a;
            a=temp;
            index++;
        }
        System.out.println(b);
    }
}
