package practiceProgram;
import java.util.Scanner;
public class primeArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]+" Is a prime number");
			}
			else {
				System.out.println(arr[i]+" Is not a prime number");
			}
		}
		
	}
		public static boolean isPrime(int i) {
			if(i==1)
				return false;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
					return false;
			}
			return true;
		}
}
