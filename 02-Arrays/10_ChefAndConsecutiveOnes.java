import java.util.Scanner;

class ChefAndConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int currentCount = 0;
        int maximumCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                currentCount++;

                if (currentCount > maximumCount) {
                    maximumCount = currentCount;
                }

            } else {
                currentCount = 0;
            }
        }

        return maximumCount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int answer = findMaxConsecutiveOnes(nums);

        System.out.println(answer);

        scanner.close();
    }
}