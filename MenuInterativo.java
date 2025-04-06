import java.util.Scanner;

public class MenuInterativo
{
    public static void main(String[] args)
    {
        int opcao = 0;

        Scanner teclado = new Scanner(System.in);
        do
        {
            System.out.println("====== MENU ======");

            System.out.println("1 - Ver Perfil");
            System.out.println("2 - Ver Mensagens");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("==== Ver Perfil ====");
                    System.out.println("Nome: Vitor Emanuel");
                    System.out.println("Idade: 22");
                    System.out.println("Programador Back End");
                    break;
                case 2:
                    System.out.println("==== Ver Mensagens ====");
                    System.out.println("Renan: 2 mensagens");
                    System.out.println("Mãe: 5 mensagens, 1 audio");
                    System.out.println("Pai: 1 audio");
                    System.out.println("Prima: Ligação Perdida de ontem");
                    break;
                default:
                    System.out.println("Opação Inválida. Digite Novamente!");
                    break;
            }

        }while (opcao != 3);
        System.out.println("Saindo do Menu....");

        teclado.close();
    }
}
