import java.util.Scanner;

class ChefAndFeedback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            String feedback = scanner.next();

            boolean hasErrorPattern =
                    feedback.contains("010") ||
                    feedback.contains("101");

            if (hasErrorPattern) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }

        scanner.close();
    }
}