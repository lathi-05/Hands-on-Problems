package practiceProgram;
import java.util.Scanner;
public class primeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		boolean prime =true;
		while(i<num) {
			if(num%i==0) {
				prime=false;
			}
			i+=1;
		}
		if(prime)
			System.out.print("It is prime");
		else
			System.out.print("It is not a prime");
	}
}
