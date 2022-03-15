package com.mass.project;

import java.util.Scanner;

public class MassiveArray {
    public static void main(String []args){

        String [] ids = new String[3];
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (index<ids.length){
            System.out.println("enter : ");
            ids[index] = scanner.nextLine();
            index++;
        }

        for(int i=0; i<ids.length; i++){
            System.out.printf(" %s ", ids[i]); // print, println, printf --> format
        }

    }
}
