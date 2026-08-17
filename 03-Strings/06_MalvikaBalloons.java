import java.util.Scanner;

class MalvikaBalloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            String balloons = scanner.next();

            int amberCount = 0;
            int brassCount = 0;

            for (int i = 0; i < balloons.length(); i++) {
                char color = balloons.charAt(i);

                if (color == 'a') {
                    amberCount++;
                } else {
                    brassCount++;
                }
            }

            int minimumFlips = Math.min(amberCount, brassCount);

            System.out.println(minimumFlips);
        }

        scanner.close();
    }
}