public class K_Pyramid {
    public static void main(String[] args) {
        // This code is similar as Rotated 180 degree traingle only after * one space is
        // required
        for (int i = 1; i <= 5; i++) {
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
