package Sabah;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};

        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
    static int [] intersection(int [] nums1, int[] nums2){
        int [] result;
        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            aSet.add(nums1[i]);
        }

        for (int n:nums2) {
            if(aSet.contains(n)){
                intersection.add(n);
            }
        }

        result = new int[intersection.size()];
        int i=0;
        for (int n: intersection) {
            result[i++] = n;
        }
        return result;
    }
}
