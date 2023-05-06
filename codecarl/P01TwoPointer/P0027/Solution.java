package codecarl.P01TwoPointer.P0027;
/*
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
 * 示例 1: 给定 nums = [3,2,2,3], val = 3, 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。 
 * 示例 2: 给定 nums = [0,1,2,2,3,0,4,2], val = 2, 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */

public class Solution {
    public int removeElement(int[] nums, int val) {
        // 一个遍历指针 j, 检查元素 nums[j] 是否与 val 相等
        // 一个维持指针 i, 每次找到一个不为val的就把他移到 指针i 的位置
        int i=-1, j=0, n=nums.length;
        while(j<n){
            if(val != nums[j]){
                ++i;    // 移动到下一位置
                nums[i] = nums[j];  // 将新元素添加进来
            }
            ++j;
        }
        return i+1;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{3, 2, 2, 3}, 2));
        System.out.println(new Solution().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
