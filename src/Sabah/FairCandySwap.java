package Sabah;

import java.util.Arrays;
import java.util.HashSet;

public class FairCandySwap {
    public static void main(String[] args) {
            int [] A = {1,1};
            int [] B = {2,2};
            int [] ans = fairCandySwap(A,B);

        System.out.println(Arrays.toString(ans));
    }

    static int[] fairCandySwap(int[] aliceSizes, int [] bobSizes){

        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int sumA = 0;
        int sumB = 0;
        for (int i : bobSizes) {
            set.add(i);
            sumB += i;
        }
        for (int i : aliceSizes) {
            sumA += i;
        }
        for (int i : aliceSizes) {
            int y = i - ((sumA - sumB) / 2);
            if (set.contains(y)) {
                ans[0] = i;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }
}
