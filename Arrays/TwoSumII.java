class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // This is a common method that uses pointers. It is usually done in sorted
        // arrays
        int n = numbers.length;
        int a_pointer = 0;
        int b_pointer = n - 1;

        while (a_pointer < b_pointer) {
            int sum = numbers[a_pointer] + numbers[b_pointer];
            if (sum < target) {
                a_pointer++;
            } else if (sum > target) {
                b_pointer--;
            } else if (sum == target) {
                return new int[] { a_pointer + 1, b_pointer + 1 };
            }
        }
        return new int[] { a_pointer + 1, b_pointer + 1 };

    }
}