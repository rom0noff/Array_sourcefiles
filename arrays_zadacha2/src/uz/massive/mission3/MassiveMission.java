package uz.massive.mission3;

public class MassiveMission {
    public static void main(String[] args) {
        int [] intArr = {1,2,4,6,8};
        double [] dblArr = {0.5,1.5,2.5,4.3,6.2};
        for(int i = 0; i < intArr.length; i++){
            dblArr[i] = dblArr[i] * intArr[i];
        }
        for(int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]+": "+dblArr[i]);
        }
    }
}
