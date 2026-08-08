import java.util.Scanner;

class DifficultyRatingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();
            int[] ratings = new int[n];

            for (int i = 0; i < n; i++) {
                ratings[i] = scanner.nextInt();
            }

            boolean isNonDecreasing = true;

            for (int i = 1; i < n; i++) {
                if (ratings[i] < ratings[i - 1]) {
                    isNonDecreasing = false;
                    break;
                }
            }

            if (isNonDecreasing) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}