import java.util.Scanner;

class FrequencyOfEachElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            System.out.print("Enter array size: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter array elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Frequency of each element:");

            for (int i = 0; i < n; i++) {
                int frequency = 0;

                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        frequency++;
                    }
                }

                System.out.print(frequency + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}