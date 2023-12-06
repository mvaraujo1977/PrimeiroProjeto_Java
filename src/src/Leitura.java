import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Digite Ano");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite Avaliacao");
        double avaliacao = leitura.nextDouble();

        System.out.println("O filme digitado foi: "+ filme);
        System.out.println("O ano digitado foi: "+ anoDeLancamento);
        System.out.println("A avaliacao digitado foi: "+ avaliacao);






    }

}
