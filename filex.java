import java.util.Scanner;

class filex {
    public static void printPattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 2 * n - i; j++) {
                    System.out.print("*");
                }
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int n = scanner.nextInt();
            printPattern(n);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
