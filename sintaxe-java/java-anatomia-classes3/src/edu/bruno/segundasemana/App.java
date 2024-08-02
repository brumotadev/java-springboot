package edu.bruno.segundasemana;
public class App {
    public static void main(String[] args) throws Exception {

        // aula metodos
        String primeiroNome = "Bruno";
        String segundoNome = "Mota";

        // todo metodo possui parametros
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
