import java.util.Scanner;

class CopyAndPaste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();
            long m = scanner.nextLong();
            String a = scanner.next();

            long onesInA = 0;

            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    onesInA++;
                }
            }

            long totalOnes = onesInA * m;

            if (totalOnes == 0) {
                System.out.println((long) n * m);
                continue;
            }

            if (totalOnes % 2 != 0) {
                System.out.println(0);
                continue;
            }

            long requiredPrefixOnes = totalOnes / 2;
            long prefixInsideA = 0;
            long answer = 0;

            for (int position = 0; position < n; position++) {
                if (a.charAt(position) == '1') {
                    prefixInsideA++;
                }

                long remaining = requiredPrefixOnes - prefixInsideA;

                if (remaining >= 0 && remaining % onesInA == 0) {
                    long completedCopies = remaining / onesInA;

                    if (completedCopies < m) {
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }

        scanner.close();
    }
}