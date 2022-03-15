package uz.massive.mission1;

import java.util.Scanner;

public class MassiveMission {
    public static void main(String[] args) {
        String[] strArr = new String[10];
        for(int i = 0; i < strArr.length; i++){
            strArr[i] = "a" + (i-1);
        }
        System.out.println("value: "+strArr[5]);

    }
}
