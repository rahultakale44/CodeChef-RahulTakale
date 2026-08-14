import java.util.Scanner;

class LargestOddSubstring {

    public static String findLargestOddSubstring(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';

            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "-1";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();

        String answer = findLargestOddSubstring(number);

        System.out.println(answer);

        scanner.close();
    }
}