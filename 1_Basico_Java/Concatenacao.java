import java.util.Locale;

public class Concatenacao {
    
    public static void main(String[] args) {

        String nome = "matheus";
        int idade = 30;
        double numero = 127.123476132; 
        
        Locale.setDefault(Locale.US);
        
        System.out.printf("Olá " + nome + " " + numero + "%n");
        System.out.printf("Olá %s, voce tem %d anos e possui %.2fR$", nome, idade, numero);
        
    }

}
