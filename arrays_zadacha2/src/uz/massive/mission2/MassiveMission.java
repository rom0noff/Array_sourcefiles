package uz.massive.mission2;

public class MassiveMission {
    public static void main(String[] args) {
        double[] dblArr = {3.5,6.8,2.3,9.1,1.0};
        for(int i = 0; i < dblArr.length; i++){
            dblArr[i] /=2;
        }
        for(int i = dblArr.length-1; i >= 0; i--){
            System.out.println("value: "+dblArr[i]);
        }
    }
}
