package Sabah;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int n = findNumbers(nums);
        System.out.println(n);

    }
    static int findNumbers(int[] nums) {
        int counter = 0;
        for (int num :nums) {
            int countDigit = 0;
            while(num !=0){
                num = num/10;
                countDigit++;
            }
            if(countDigit %2 == 0){
                counter++;
            }

        }
        return counter;
    }

    static int findNumbers2(int[] nums) {
        int count = 0;
        for (int i:nums) {
            String str = String.valueOf(nums[i]);
            if(str.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
