public class D_InvertedHalfPyramid {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {                       //here, we iterete in descending
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}