package uz.lesson.sortirovka;

public class Sort {
    public static void main(String[] args) {
        int [] massive = {455,7548,1122,3122,54,12,12,12,566,54232};
        int max;
        for(int i = 0; i < massive.length; i++){
            for(int j = 1; j < massive.length; j ++){
                if(massive[j] > massive[j-1]){
                    max = massive[j];
                    massive[j] = massive[j-1];
                    massive[j-1] =  max;
                }
            }

        }
        for (int i = 0; i < massive.length; i++){
            System.out.print(massive[i]+", ");
        }

    }
}
