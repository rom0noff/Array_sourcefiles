package com.massive.zadcha;

import java.util.Scanner;

public class MassiveMaxMinMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N= ");
        int n = scanner.nextInt();
        int [] massive = new int [n];


        for(int i = 0; i < massive.length; i++){
            System.out.print("sonlar: ");
          massive[i] = scanner.nextInt();
        }
        int max = massive[0];
        for(int i = 0; i < massive.length; i++){
            if(max > massive[i]){

            }else max = massive[i];
        }
        System.out.printf("numbers entered max: %5d \n",max);
        System.out.println("--------------------------------");
        int razmer = massive.length;
        double sum = 0;
        for(int i = 0; i < razmer; i++){
            sum = sum + massive[i];
        }
        double result = sum / razmer;
        System.out.println("numbers entered middle: "+result);
        System.out.println("-------------------------------");
        int min = massive[0];
        for(int i = 0; i < massive.length; i++){
            if(min > massive[i]){
                min = massive[i];
            }
        }
        System.out.printf("numbers entered min: %5d  \n",min);


    }
}
