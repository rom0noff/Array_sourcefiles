package com.biz.programmist;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        int [] months = {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){

            case 1:
                System.out.println("January ");
                break;

            case 2:
                System.out.println("February");
                break;

            default:
                System.out.println("This is not month");

        }

    }
}
