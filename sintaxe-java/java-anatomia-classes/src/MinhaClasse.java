public class MinhaClasse {

    public static void main (String [] args) {
        System.out.printf("Olá turma, sejam bem-vindos");

        int ano = 2021;
        
        ano = 2022;

        final String BR = "Brasil"; // variavel com final/maiuscula não pode ter seu valor alterado

        BR = "Brazil";

        double PI = 3.14;

        int ESTADOS_BRASILEIROS = 27;

        int ANO_2000 = 2000;


        // declaração inválida de variáveis

        int numero&um = 1; // os unicos simbolos permitidos são _ e $
        int 1numero = 1; // uma variavel não pode começar com numericos
        int numero um = 1; // não pode ter espaço no nome da variavel
        int long = 1; // long faz parte das palavras reservadas da lingua inglesa

        // declaração válida de variaveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;

    }

}
