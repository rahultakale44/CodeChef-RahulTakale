import java.util.Scanner;

class MinToMax {

    public static int countNonMinimum(int[] nums) {

        int minimum = nums[0];
        int minimumCount = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < minimum) {
                minimum = nums[i];
                minimumCount = 1;
            } 
            else if (nums[i] == minimum) {
                minimumCount++;
            }
        }

        return nums.length - minimumCount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            int n = scanner.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int answer = countNonMinimum(nums);
            System.out.println(answer);
        }

        scanner.close();
    }
}