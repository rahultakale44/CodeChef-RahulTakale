import java.util.Scanner;

class WorldChessChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            long prizeMultiplier = scanner.nextLong();
            String matchResults = scanner.next();

            int carlsenPoints = 0;
            int chefPoints = 0;

            for (int i = 0; i < matchResults.length(); i++) {
                char result = matchResults.charAt(i);

                if (result == 'C') {
                    carlsenPoints += 2;
                } else if (result == 'N') {
                    chefPoints += 2;
                } else {
                    carlsenPoints++;
                    chefPoints++;
                }
            }

            long carlsenPrize;

            if (carlsenPoints > chefPoints) {
                carlsenPrize = 60 * prizeMultiplier;
            } else if (carlsenPoints == chefPoints) {
                carlsenPrize = 55 * prizeMultiplier;
            } else {
                carlsenPrize = 40 * prizeMultiplier;
            }

            System.out.println(carlsenPrize);
        }

        scanner.close();
    }
}