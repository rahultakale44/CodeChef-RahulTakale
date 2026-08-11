import java.util.Scanner;

class CodeChefStreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int numberOfDays = scanner.nextInt();

            int[] om = new int[numberOfDays];
            int[] addy = new int[numberOfDays];

            for (int i = 0; i < numberOfDays; i++) {
                om[i] = scanner.nextInt();
            }

            for (int i = 0; i < numberOfDays; i++) {
                addy[i] = scanner.nextInt();
            }

            int omCurrentStreak = 0;
            int omMaximumStreak = 0;

            int addyCurrentStreak = 0;
            int addyMaximumStreak = 0;

            for (int i = 0; i < numberOfDays; i++) {

                if (om[i] > 0) {
                    omCurrentStreak++;
                    omMaximumStreak =
                            Math.max(omMaximumStreak, omCurrentStreak);
                } else {
                    omCurrentStreak = 0;
                }

                if (addy[i] > 0) {
                    addyCurrentStreak++;
                    addyMaximumStreak =
                            Math.max(addyMaximumStreak, addyCurrentStreak);
                } else {
                    addyCurrentStreak = 0;
                }
            }

            if (omMaximumStreak > addyMaximumStreak) {
                System.out.println("Om");
            } else if (addyMaximumStreak > omMaximumStreak) {
                System.out.println("Addy");
            } else {
                System.out.println("Draw");
            }
        }

        scanner.close();
    }
}