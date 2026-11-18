import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "Richard67";
        String senhaCorreta = "R6767";

        int tentativas = 0;
        boolean logado = false;

        while (tentativas < 3) {
            System.out.println("Digite o usuário: ");
            String usuario = sc.nextLine();

            System.out.println("Digite a senha: ");
            String senha = sc.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                logado = true;
                menu.menuImpressora();
                break;
            } else {
                tentativas++;
                int restantes = 3 - tentativas;

                if (restantes > 0) {
                    System.out.println("Usuário ou senha incorretos! Tentativas restantes: " + restantes);
                }
            }
        }

        if (!logado) {
            System.out.println("Acesso bloqueado! Você excedeu o limite de 3 tentativas.");
        }

    }
}
