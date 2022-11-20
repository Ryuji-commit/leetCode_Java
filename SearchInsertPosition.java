public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[0] >= target) {
            return 0;
        }

        while(end >= start) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] < target) {
                start = middle + 1;
                continue;
            }

            if (nums[middle] > target) {
                end = middle - 1;
                continue;
            }
        }

        return end + 1;
    }
}
