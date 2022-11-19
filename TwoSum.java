class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int tempNum = nums[i];
            int expectedNum = target - tempNum;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == expectedNum) {
                    int[] result = new int[] {i, j};
                    return result;
                }
            }
        }

        // When result is not fount, throw Exception
        throw new IllegalArgumentException("result not found");
    }
}

