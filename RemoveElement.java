public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[curIndex++] = nums[i];
            }
        }

        return curIndex;
    }
}
