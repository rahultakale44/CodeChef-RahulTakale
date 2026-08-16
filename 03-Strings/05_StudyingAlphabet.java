import java.util.Scanner;

class StudyingAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String knownLetters = scanner.next();

        boolean[] known = new boolean[26];

        for (int i = 0; i < knownLetters.length(); i++) {
            char ch = knownLetters.charAt(i);
            known[ch - 'a'] = true;
        }

        int numberOfWords = scanner.nextInt();

        while (numberOfWords-- > 0) {
            String word = scanner.next();

            boolean canRead = true;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (!known[ch - 'a']) {
                    canRead = false;
                    break;
                }
            }

            if (canRead) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}