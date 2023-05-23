import atividade2.hospede;
import atividade2.quartos;
import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        hospede hospede1 = new hospede();
        hospede hospede2 = new hospede();
        
        quartos a = new quartos();
        quartos b = new quartos();
        
        System.out.println("Nome 1º hospede: ");
        hospede1.nome = entrada.nextLine();
        System.out.println("Idade 1º hospede: ");
        hospede1.idade = entrada.nextInt();
        
        System.out.println("Nome 2º hospede: ");
        hospede2.nome = entrada.nextLine();
        System.out.println("Idade 2º hospede: ");
        hospede2.idade = entrada.nextInt();
        
        
        a.quartoA = hospede1.nome;
        
        
        /*if(hospede2.idade<hospede1.idade){
            quartoB
        }
        */
    }
    
}
