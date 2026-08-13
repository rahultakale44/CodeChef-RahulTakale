import java.util.Scanner;

class DDMMorMMDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            String date = scanner.next();

            int firstPart = Integer.parseInt(date.substring(0, 2));
            int secondPart = Integer.parseInt(date.substring(3, 5));

            if (firstPart <= 12 && secondPart <= 12) {
                System.out.println("BOTH");
            } else if (firstPart > 12) {
                System.out.println("DD/MM/YYYY");
            } else {
                System.out.println("MM/DD/YYYY");
            }
        }

        scanner.close();
    }
}