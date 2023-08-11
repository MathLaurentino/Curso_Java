import java.util.Scanner;

public class Entrada_de_Dados {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
			
        String nome;
        String nomeCompleto;
        int idade;
        double dinheiro;
        char letra;
        
        System.out.println("Digite seu primeiro nome: ");
        nome = sc.next();
        
        sc.nextLine();
        
        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        System.out.println("Quanto de dinheiro voce tem? ");
        dinheiro = sc.nextDouble(); 
        // pega o padrão definido na máquina Br = , / US = .
        
        System.out.println("Digite uma letra: ");
        letra = sc.next().charAt(0); 
        
        System.out.println("Seu primeiro nome: " + nome);
        System.out.println("Seu nome completo: " + nomeCompleto);
        System.out.println("Sua idade: " + idade);
        System.out.println("Seu dinheiro: " + dinheiro);
        System.out.println("Sua letra: " + letra);			
        
        sc.close();

    }
}
