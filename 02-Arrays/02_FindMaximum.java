import java.util.Scanner;

class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int maximum = 0;

            for (int i = 0; i < N; i++) {
                int height = sc.nextInt();

                if (height > maximum) {
                    maximum = height;
                }
            }

            System.out.println(maximum);
        }

        sc.close();
    }
}