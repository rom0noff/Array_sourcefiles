package uz.massive.mission1316;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int [][] intArr = new int [5][8];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < intArr.length; i++){
            for(int j= 0; j < intArr[i].length; j++){
                System.out.print("intArr["+i+"]"+"["+j+"] = ");
                intArr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++){
                System.out.print("\033[0;94m"+intArr[i][j]+" ");
            }
            System.out.println();
        }
        for(int row = 0; row < intArr.length; row++){
            for(int column = 0; column < intArr[row].length; column++){
                intArr[row][column] = row * column;
            }
        }
        System.out.println("------------------------");
        for (int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++){
                System.out.print("\033[0;93m"+intArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
