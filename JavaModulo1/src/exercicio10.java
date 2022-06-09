import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor [] = new int[5];
		 
		//vetor[0] = 40;
		//vetor[1] = 12;
		//vetor[2] = 41;
		//vetor[3] = 13;
		//vetor[4] = 9;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero; ");
		    vetor[i] = sc.nextInt();
		    
		  // System.out.println(vetor[i]);
		}
		
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		
		
		
		
		
		
	}

}
