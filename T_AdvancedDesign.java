public class T_AdvancedDesign {
    // Using mixture of inverted 0's and 1's pyramid
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) { // (n-i) spaces required
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // normal 0's and 1's code
                int a = i + j;
                if (a % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();

        }
        // normal 0 and 1 pyramid
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) { // (n-i) spaces required
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // normal 0's and 1's code
                int a = i + j;
                if (a % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();

        }
    }
}
