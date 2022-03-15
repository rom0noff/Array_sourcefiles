package uz.lesson.DeleteMassive;

import java.util.Arrays;

public class RemoveMassive2 {
    public static void main(String[] args) {
        int test_array[] = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(removeElement(test_array,2)));
    }
    public static int[] removeElement(int[] nums, int val){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                count++;
            }
        }
        int[] newArray = new int[count];
        int offset = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                offset++;
            }else{
                newArray[i-offset] = nums[i];
            }
        }
        return newArray;
    }
}
