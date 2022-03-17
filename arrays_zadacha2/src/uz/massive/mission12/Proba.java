package uz.massive.mission12;

import java.util.Random;

public class Proba {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] intArr = new int[1000];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = rand.nextInt(2000);
        }
        int max;
        for(int i = 0; i < intArr.length; i++){
            for(int j = 1 ; j < intArr.length; j ++){
                if(intArr[j-1] < intArr[j]){
                    max = intArr[j-1];
                    intArr[j-1] = intArr[j];
                    intArr[j] = max;
                }
            }
        }
        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i]+", ");
        }

    }
}
