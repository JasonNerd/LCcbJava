package codecarl.P01TwoPointer.P0977;
/*
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * 示例 1： 输入：nums = [-4,-1,0,3,10] 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]，排序后，数组变为 [0,1,9,16,100]
 * 示例 2： 输入：nums = [-7,-3,2,3,11] 输出：[4,9,9,49,121]
 * https://leetcode.cn/problems/squares-of-a-sorted-array/
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        // 1. 先作平方
        int n = nums.length;
        for(int i=0; i<n; i++)
            nums[i] = nums[i]*nums[i];
        int res[] = new int[n];
        // 2. 设置两个指针i,  j 分别指向首, 尾部
        int i=0, j=n-1, k=n-1;
        while(i<j){
            if(nums[j] > nums[i])
                res[k--] = nums[j--];
            else res[k--] = nums[i++];
        }
        res[k] = nums[i];
        return res;
    }
    public static void main(String[] args) {
        // -7,-3,2,3,11
        // -4,-1,0,3,10
        // -5,-3,-2,-1
        int nums[] = new Solution().sortedSquares(new int[]{-5,-3,-2,-1});
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
