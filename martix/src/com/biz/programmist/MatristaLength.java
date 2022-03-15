package com.biz.programmist;

public class MatristaLength {
    public static void main(String[] args) {

        // 1. Static 2D -> Matritsa
        int [][] matr1 = { {1, 2, 4, 3},
                          {4, 5, 60, 4},
                          {3, 8, 9, 0},
                          {3, 6, -9, 1}};

        for (int i=0; i< matr1.length; i++){
            for (int j=0; j< matr1[i].length; j++) {
                System.out.print(" " + matr1[i][j]);
            }
            System.out.println();
        }

    }
}


/**
 Task:1
 Matritsani dioganla boyicha summa, umnajiniya.

 Task2:
 diaganllarni : 0 qilib chiqamiz.
 * **/