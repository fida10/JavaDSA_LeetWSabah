package Sabah;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int sum = sumOfUnique(nums);
        System.out.println(sum);
    }
    static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int sum = 0;
        for(int num: nums){

            if(!freq.containsKey(num)){
                int count =0;
                freq.put(num,++count);
            }
            else {
                int v = freq.get(num) +1;
                freq.put(num, v+1);
            }
        }
        for(Map.Entry<Integer, Integer> e: freq.entrySet()){
            if(e.getValue()==1)
                sum+=e.getKey();
        }
        return sum;

    }
}
