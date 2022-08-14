package Sabah;

public class MaximumWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,5},{7,3},{3,5}};
        int sum = maximumWealth(accounts);
        System.out.println(sum);
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i =0;i< accounts.length; i++){
            int sum = 0;
            for (int j = 0; j< accounts[0].length; j++){
                sum = sum+ accounts[i][j];

            }
            max = Math.max(sum, max);


        }
        return max;
    }
}
