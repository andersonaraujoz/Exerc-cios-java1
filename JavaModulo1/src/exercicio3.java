import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Digite o seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado!!  Media = " + media);	
		}else if (media >= 3 && media < 7) {
			System.out.println("Aluno em recuperação Media = " + media);
		}else {
			System.out.println("Aluno reprovado Media = " + media);
		}
		
		
	
		
	}

}
