package uz.lesson.TubSonlar;

public class TubSonlar {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf(i+", ");
            }
        }
        System.out.println("");
        // or using labeled loops
        our_for:
        for (int i = 2; i <= 100; i++){
            for(int j = 2; j < i; j++) {
                if(i % j == 0){
                    continue our_for;
                }
            }
            System.out.print(i+", ");
        }
    }
}
