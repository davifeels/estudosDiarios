public class Source {

    public static void main(String[] args) {

        String nome = "Davi";
        String sobre_nome = "Anderson";
        String sangue = "O+";
        String profissao = "Desenvolvedor Java";
        int codigo_acesso = 100;
        String cidade = "Brasília";
        int idade = 24;

        System.out.println(centralizar("===================================="));
        System.out.println(centralizar("    SISTEMA DE DADOS DO USUÁRIO     "));
        System.out.println(centralizar("====================================\n"));

        System.out.println(centralizar("Nome completo: " + nome + " " + sobre_nome));
        System.out.println(centralizar("Idade: " + idade + " anos"));
        System.out.println(centralizar("Tipo sanguíneo: " + sangue));
        System.out.println(centralizar("Profissão: " + profissao));
        System.out.println(centralizar("Cidade: " + cidade));
        System.out.println(centralizar("        Código de acesso: " + codigo_acesso));

        String resultado = nome + idade;
        double soma = idade + 0;

        System.out.println();
        System.out.println(centralizar("Nome + Idade: " + resultado));
        System.out.println(centralizar("===================================="));
    }

    public static String centralizar(String texto) {
        int larguraConsole = 40;
        int espacos = (larguraConsole - texto.length()) / 2;

        if (espacos > 0) {
            return " ".repeat(espacos) + texto;
        } else {
            return texto;
        }
    }
}

