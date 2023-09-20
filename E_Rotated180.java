public class E_Rotated180 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<5-i;j++) {            //(n-i)spaces required
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {              //normal half pyramid code
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
