package DayTry.LeetcodeTry;

public class RemoveDuplicatefromArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5, 6};
        int newLength = removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }
}
