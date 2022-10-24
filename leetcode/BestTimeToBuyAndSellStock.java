package leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }

    static int maxProfit(int[] nums) {
        int maxProfit = 0;
        int minBuy = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(minBuy < nums[i]) {
                maxProfit = Math.max(maxProfit, nums[i] - minBuy);
            } else {
                minBuy = nums[i];
            }

        }
        return maxProfit;
    }
}
