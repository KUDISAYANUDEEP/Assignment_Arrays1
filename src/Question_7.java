public class Question_7
{
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertPos = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < n; i++)
        {
            if (nums[i] != 0)
            {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Fill the remaining positions with zeros
        while (insertPos < n)
        {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}