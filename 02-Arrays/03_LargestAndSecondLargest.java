import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();

            int largest = -1;
            int secondLargest = -1;

            for (int i = 0; i < n; i++) {
                int current = scanner.nextInt();

                if (current > largest) {
                    secondLargest = largest;
                    largest = current;
                } else if (current < largest && current > secondLargest) {
                    secondLargest = current;
                }
            }

            System.out.println(largest + secondLargest);
        }

        scanner.close();
    }
}