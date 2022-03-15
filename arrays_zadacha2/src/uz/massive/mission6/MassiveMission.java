package uz.massive.mission6;

public class MassiveMission {
    public static void main(String[] args) {
        String [] strArr = new String[10];
        String sep = "";
        for(int i = 1; i < strArr.length; i++){
            System.out.println(sep + strArr[i]);
            sep = ",";
        }
    }
}
