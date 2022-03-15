package com.mass.project;

import java.util.Arrays;
import java.util.Scanner;

public class MassiveInt {
    public static void main(String[] args) {

        int[] sonlar = new int[3];
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (index < sonlar.length) {
            System.out.println("number : ");
            sonlar[index] = scanner.nextInt();
            index++;
        }

        for (int i = 0; i < sonlar.length; i++) {
            System.out.printf(" %5d  \n", sonlar[i]); // print, println, printf --> format
        }
        System.out.println("-----------------------------");
        Arrays.sort(sonlar);
        for (int i = 0; i < sonlar.length; i++) {
            System.out.printf(" %8d  \n", sonlar[i]);
        }
    }
}