package myPackage;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter a character");
        char alpha = sc.next().trim().charAt( 0 );
        if(alpha>='a' && alpha<='z'){
            System.out.println("Character is in lower case. ");
        } else if ( alpha>='A' && alpha<='Z') {
            System.out.println("Character is in Upper case. ");
        }
        else {
            System.out.println("Invalid Input: ");
        }
    }
}
