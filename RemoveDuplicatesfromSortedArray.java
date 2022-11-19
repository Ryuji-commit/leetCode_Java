public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0];
        int lastIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != cur) {
                cur = nums[i];
                nums[++lastIndex] = cur;
            }
        }

        return lastIndex;
    }
}
