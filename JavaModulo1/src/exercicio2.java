import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome : ");
		String nome = sc.nextLine();
		
		System.out.println("Digite um numero : ");
		int num = sc.nextInt();
		
		int i = 1;
		
			
		for (i = 1; i <= num * 2; i++) {
			System.out.println(i + "_" + nome);
			
			
		}
		
		
		
		
		 

	}

}
