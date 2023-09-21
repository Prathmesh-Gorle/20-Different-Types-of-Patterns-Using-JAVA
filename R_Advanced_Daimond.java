public class R_Advanced_Daimond {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) { // (n-i) spaces required
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " "); // after star one space is required
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) { // (n-i) spaces required
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " "); // after star one space is required
            }
            System.out.println();
        }

    }

}