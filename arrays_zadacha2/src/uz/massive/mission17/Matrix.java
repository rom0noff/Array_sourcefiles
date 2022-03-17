package uz.massive.mission17;

public class Matrix {
    public static void main(String[] args) {
        int [][] intArr = new int [5][8];
        int sum = 0;
        for(int row = 0; row < intArr.length; row++){
            for(int column = 0; column < intArr[row].length; column++){
                System.out.print(intArr[row][column]+" ");
                sum += intArr[row][column];
            }
            System.out.println(": "+sum);
            sum = 0;
        }
    }
}
