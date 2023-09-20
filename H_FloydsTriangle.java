public class H_FloydsTriangle {
    public static void main(String[] args) {
        int numbers = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numbers + " ");
                numbers++;
            }
            System.out.println();
        }
    }
}