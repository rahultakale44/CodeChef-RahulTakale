import java.util.Scanner;

class RedLightGreenLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int numberOfPlayers = scanner.nextInt();
            int giHunHeight = scanner.nextInt();

            int playersToRemove = 0;

            for (int i = 0; i < numberOfPlayers; i++) {
                int playerHeight = scanner.nextInt();

                if (playerHeight > giHunHeight) {
                    playersToRemove++;
                }
            }

            System.out.println(playersToRemove);
        }

        scanner.close();
    }
}
