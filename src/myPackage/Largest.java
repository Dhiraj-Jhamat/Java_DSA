package myPackage;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

//        if ( a > b && a > c ) System.out.println( a );
//        else if ( b > c ) {
//            System.out.println( b );
//        } else {
//            System.out.println( c );
//        }
        int max = Math.max( c,Math.max( a,b ) ) ;
        System.out.println(max);
        System.out.println("This is max bada number");
    }
}
