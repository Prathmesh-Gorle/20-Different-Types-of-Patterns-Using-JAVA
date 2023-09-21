public class M_HollowRhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 4; j++) { // same as hollow rectangle
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // for spacing
                }
            }
            System.out.println();
        }
    }

}
