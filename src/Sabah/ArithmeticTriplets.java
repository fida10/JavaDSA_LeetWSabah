package Sabah;

import java.util.*;

public class ArithmeticTriplets {
    public static void main(String[] args) {

        int[] arr = {0,1,4,6,7,10};
        int number =  arithmeticTriplets(arr, 3);
        System.out.println(number);
    }

    static int arithmeticTriplets(int[] nums, int diff) {
        int count =0;

        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            set.add(n);
        }
        for (int n: nums){
            if(set.contains(n - diff) && set.contains(n + diff))
                count++;
        }
        return count;
    }
}
