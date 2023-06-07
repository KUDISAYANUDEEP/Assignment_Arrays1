import java.util.Arrays;

public class Question_6 {
    public static boolean containsDuplicate(int[] nums)
    {
        Arrays.sort(nums);  // Sort the array in ascending order

        // Check if any adjacent elements are the same
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
            {
                return true;  // Found a duplicate
            }
        }

        return false;  // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};//[1,1,2,3]
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}