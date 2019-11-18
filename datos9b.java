import java.util.Scanner;

public class datos9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner pilla = new Scanner(System.in);

		int m = 0, n = 0;
		boolean res1, res2;

		System.out.println("introduzca el valor de m: ");
		// como recojo info del teclado
		m = pilla.nextInt();
		System.out.println("introduzca el valor de n: ");
		// como recojo info del teclado
		n = pilla.nextInt();

		res1 = (m > n) || (m >= n); // res=false
		res2 = !(    (m < n)    &&       (m != n)    ); // res=false
	
		
		System.out.println("res vale : " + res1);
		System.out.println("res vale : " + res2);
		
		pilla.close();
	}

}
