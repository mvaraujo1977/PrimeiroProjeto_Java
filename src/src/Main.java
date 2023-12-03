// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Ano de lançamento: " + anoDeLancamento + ", Com Nota: "+ notaDoFilme );

        double media = (9.8 + 6.3 + 8.0)/ 3;
        System.out.println("Média: " + media);

        //Text Block foi introduzido na versao 15 do Java
        String sinopse = """
                        Filme Top Gun
                        Filme de aventura com galã dos anos 80
                        Muito bem!
                        Ano de Lançamento                        
                        """ + anoDeLancamento;
        System.out.println(sinopse);

        String senha = "1234";
        if (senha.equals("1234")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        /*Uma das maneiras mais comuns de se formatar textos em Java é utilizando o
        método format(), da classe String. Esse método permite formatar um texto
        utilizando diversos placeholders, que são representados pelo caractere %
        seguido de uma letra que indica o tipo de dado que será inserido no placeholder.
        Por exemplo, %s indica que uma String será inserida no placeholder, %d indica
        um valor inteiro e %f indica um valor decimal. Vamos ver um exemplo:
         */

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        //Fazendo casting
        int classificacao = (int) (media/2);
        System.out.println("Classificação " + classificacao);

        // transformando grau celsius em fahrenheit
        double celsius = 29;
        int fahrenheit = (int)(celsius * 1.8) +32;

        System.out.println("A tempenratura em Fahrenheit é: " + fahrenheit );
    }
}