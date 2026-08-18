import java.util.Scanner;

class NButtons1Bulb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int numberOfButtons = scanner.nextInt();

            String initialState = scanner.next();
            String finalState = scanner.next();

            int changedButtons = 0;

            for (int i = 0; i < numberOfButtons; i++) {
                if (initialState.charAt(i) != finalState.charAt(i)) {
                    changedButtons++;
                }
            }

            int finalBulbState;

            if (changedButtons % 2 == 0) {
                finalBulbState = 1;
            } else {
                finalBulbState = 0;
            }

            System.out.println(finalBulbState);
        }

        scanner.close();
    }
}