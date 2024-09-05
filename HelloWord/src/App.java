public class App {
    public static void main(String[] args) {
        System.out.println(nomeCompleto("Ythalo", "Pereira"));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método:" + primeiroNome.concat(" ").concat(segundoNome);
    }

}

