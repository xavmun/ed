import java.util.Scanner;

public class Aleatorio1000 {

	public static void main(String[] args) {
		int x;
		int max = 10;
		int al = (int) (Math.random()*max + 1);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Di u numero del 1 al 1000:");
		x = sc.nextInt();
		
		if (x == al) {
			System.out.println("Eres un dios, compañero");
		}
		else
			System.out.println("Lemao");
		
		
		
		

	}

}
