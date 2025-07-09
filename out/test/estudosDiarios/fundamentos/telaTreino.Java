package fundamentos;

import java.util.Scanner;

public class telaTreino {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "VaiSccp";
        String senha = "1910";

        System.out.println(ANSI_BLUE + "========== Login ==========" + ANSI_RESET);
        System.out.print("Usuário: ");
        String u = sc.nextLine();
        System.out.print("Senha: ");
        String s = sc.nextLine();

        if (u.equals(usuario) && s.equals(senha)) {
            System.out.println(ANSI_BLUE + "\n✅ Login realizado!" + ANSI_RESET);
            int opcao = -1;
            while (opcao != 9) {
                System.out.println("\n=== MENU PRINCIPAL ===");
                System.out.println("1 - Ver notícias");
                System.out.println("2 - Ler mensagens");
                System.out.println("3 - Ver perfil");
                System.out.println("9 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine(); // limpa buffer

                switch (opcao) {
                    case 1:
                        menuNoticias(sc);
                        break;
                    case 2:
                        menuMensagens(sc);
                        break;
                    case 3:
                        System.out.println("\n👤 Usuário: " + usuario);
                        break;
                    case 9:
                        System.out.println("\n👋 Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } else {
            System.out.println(ANSI_WHITE + "\n❌ Login inválido." + ANSI_RESET);
        }

        sc.close();
    }

    public static void menuNoticias(Scanner sc) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n📰 NOTÍCIAS");
            System.out.println("1 - Java 21 lançado!");
            System.out.println("2 - FURIA vence campeonato!");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma notícia: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n📢 Java 21 está mais rápido e seguro!");
                    break;
                case 2:
                    System.out.println("\n🏆 FURIA é campeã da ESL Pro League!");
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void menuMensagens(Scanner sc) {
        String[] mensagens = {
                "🎉 Bem-vindo à plataforma!",
                "📄 Seu relatório mensal está pronto.",
                "📢 Atualizações disponíveis no sistema."
        };

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n✉️ MENSAGENS");
            for (int i = 0; i < mensagens.length; i++) {
                System.out.println((i + 1) + " - Mensagem " + (i + 1));
            }
            System.out.println("0 - Voltar");
            System.out.print("Qual mensagem deseja ler? ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao >= 1 && opcao <= mensagens.length) {
                System.out.println("\n📨 " + mensagens[opcao - 1]);
            } else if (opcao == 0) {
                System.out.println("Voltando ao menu principal...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
