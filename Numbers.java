package com.company;
import java.util.*;
public class Numbers {
    public static void main(String []args ){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int y= ran.nextInt(100)+1;
        int count=0;

        while (true) {
            int x=sc.nextInt();
            count++;
            if (x == y) {
                System.out.println("you guess perfectly");
                System.out.println("you guess in "+count);

                break;
            } else if (x < y) {
                System.out.println("guess higher than the " + x);



            } else {
                System.out.println("guess lesser than the " + x);
            }


        }

    }
}
