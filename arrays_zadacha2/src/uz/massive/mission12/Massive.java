package uz.massive.mission12;

import java.util.Random;

public class Massive {
    public static void main(String[] args) {
        Random rand = new Random();
            int [] intArr = new int[50];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = rand.nextInt(50);
        }
            for(int i = 0; i < intArr.length; i++){
                int indexOfMin = i;
                for(int j = i + 1; j < intArr.length; j++){
                    if(intArr[j] < intArr[indexOfMin]){
                        indexOfMin = j;
                    }
                }
                if(indexOfMin != i){
                    int tmp = intArr[i];
                    intArr[i] = intArr[indexOfMin];
                    intArr[indexOfMin] = tmp;
                }

            }
            for(int i = 0; i < intArr.length; i++){
                System.out.println(intArr[i]);
            }
    }
}
