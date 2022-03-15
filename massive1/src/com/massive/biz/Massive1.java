package com.massive.biz;

public class Massive1 {
    public static void main(String[] args) {
        int [][] proba = new int[4][4];
        int [][] massive = {{12,45,78,95},
                {15,11,84,41},
                {97,13,14,74},
                {81,80,42,62}};
        System.out.println("------Matrix------");
        for(int i = 0; i < massive.length; i++){
            for(int j = 0; j < massive[i].length; j++){
                System.out.print(" "+massive[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----Diaganal_1-----");
        int result=0;
        int sum=0;
        int umnajenya =1;
        for (int i = 0; i < massive.length; i++){
            sum = sum + massive[i][i];
            umnajenya = umnajenya * massive[i][i];
            result = massive[i][i];

            for(int j = i; j > 0; j--){
                System.out.print("    ");
            }
            System.out.println(result);
        }
        System.out.println("Diaganal_1 summasi: "+sum);
        System.out.println("Diaganal_1 umnajaneya: "+umnajenya);
        System.out.println("-------------------");

        for (int i = 0; i < massive.length; i++){
            for(int j = 0; j < massive.length; j++) {
                massive[i][i] = 0;
                System.out.print(" "+massive[i][j]+" ");
            }
            System.out.println();
        }



        System.out.println("-----Diaganal_2-----");
        int summ = 0;
        umnajenya = 1;
        int bosh = 0;
        int j;
        for(int i = 0; i < massive.length; i++){
            for( j = massive.length-1-i; j >= massive.length-1-i; j--){
                summ = summ + massive[i][j];
                umnajenya = umnajenya * massive[i][j];
                bosh = massive[i][j];
            }
            for(int c = j+1; c > 0; c--){
                System.out.print("    ");
            }
            System.out.println(bosh);
        }
        System.out.println("Diaganal_2 summasi: "+summ);
        System.out.println("Diaganal_2 umnajaneya: "+umnajenya);
        System.out.println("--------------------");
        for(int i = 0; i < massive.length; i++){
            for( j = massive.length-1-i; j >= massive.length-1-i; j--){
               massive[i][j]=0;

            }
        }
        for(int a = 0; a < massive.length; a++){
            for(int b = 0; b < massive[a].length; b++){
                System.out.print(" "+massive[a][b]+" ");
            }
            System.out.println();
        }
    }
}
