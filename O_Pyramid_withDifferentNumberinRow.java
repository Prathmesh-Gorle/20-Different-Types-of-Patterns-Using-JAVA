public class O_Pyramid_withDifferentNumberinRow {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // here we take j hence Different number is printed in row
            }
            System.out.println();

        }
    }

}
