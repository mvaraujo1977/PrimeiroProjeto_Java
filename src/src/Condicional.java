public class Condicional {

    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";


        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estao curtindo!");
        }
        else {
            System.out.println("Não é lançamento !");
        }
        // esse é o ou || e esse é o and &&
        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");

        }else{
            System.out.println("Deve pagar locação!");
        }
    }
}
