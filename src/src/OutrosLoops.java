import java.util.Scanner;

public class OutrosLoops {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;



        while(nota != -1){
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();

            if (nota != -1){

                mediaAvaliacao += nota;
                totalDeNotas += 1;

            }

        }
        System.out.println(totalDeNotas);

        System.out.println("Média de avaliacao:" + mediaAvaliacao/totalDeNotas );

    }
}
