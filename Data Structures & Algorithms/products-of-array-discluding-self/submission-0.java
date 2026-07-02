class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int i = 0;
        int product = 1;
        while (i <= nums.length - 1) {
            int j = 0;
            while (j <= nums.length - 1) {
                if (j == i) {
                    j++;
                    continue;
                }
                product = product * nums[j];
                j++;
            }
            res[i] = product;
            product = 1;
            i++;
        }
        return res;
    }
}