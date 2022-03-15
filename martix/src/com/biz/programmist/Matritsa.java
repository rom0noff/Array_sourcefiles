package com.biz.programmist;

public class Matritsa {
    public static void main(String[] args) {
        // 1. Static 2D -> Matritsa
        int [][] matr1 = { {1, 4, 3},
                           {4, 5, 6},
                           {3, 8, 9}};

        for (int i=0; i< 3; i++){
            for (int j=0; j< 3; j++) {
                System.out.print(" " + matr1[i][j]);
            }
            System.out.println();
        }

    }
}
