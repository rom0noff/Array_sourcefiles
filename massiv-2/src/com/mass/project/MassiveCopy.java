package com.mass.project;

import java.util.Arrays;
import java.util.Scanner;

public class MassiveCopy {
    public static void main(String[] args) {
        //

        int[] sonlar = new int[10]; // object massive
        int [] number = sonlar;

        int [] google = {1, 3, 6, 7 ,8 ,9};
        int [] yandex = google;

        yandex[3] = 15;


        int index = 0;
//        Scanner scanner = new Scanner(System.in);

        while (index < yandex.length) {

            sonlar[index] = yandex[index];
            System.out.print("  " + sonlar[index]);
            index++;
        }

        int [] heyBola = Arrays.copyOf(yandex, yandex.length);


    }
}
