import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
	
        System.out.println("Escolha um código para exibir o dia: ");
        System.err.println("+==========================+");
        System.err.println("| 1 - Domingo | 5 - Quinta |");
        System.err.println("| 2 - Segunda | 6 - Sexta   |");
        System.err.println("| 3 - Terça   | 7 - Sábado   |");
        System.err.println("| 4 - Quarta  |                      |");
        System.err.println("+==========================+");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String dia = " ";
       
switch(num) {
           
                case 1:
                    dia = "Domingo"; //System.out.println("Domingo");
                    break;
                case 2:
                    dia = "Segunda-feira";
                    break;
                case 3:
                    dia = "Terça-feira";
                    break;
                case 4:
                    dia = "Quarta-feira";
                    break;
                case 5:
                    dia = "Quinta-feira";
                    break;
                case 6:
                    dia = "Sexta-feira";
                    break;
                case 7:
                    dia = "Sábado";
                    break;
                default:
                    dia = "Código inválido!! - Digite novamente: ";
                    break;
        }
        System.out.println(dia);
    
        }
      
    }	

