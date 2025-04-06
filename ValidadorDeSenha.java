import java.util.Scanner;

public class ValidadorDeSenha
{
    public static void main(String[] args)
    {
        System.out.println("========================");
        System.out.println("  VALIDADOR DE SENHA");
        System.out.println("========================");

        String senhaCorreta = "java123";
        String senhaUsuario;

        Scanner teclado = new Scanner(System.in);

        do
        {
            System.out.print("Digite sua senha: ");
            senhaUsuario = teclado.next();

            if (!senhaUsuario.equals(senhaCorreta))
            {
                System.out.println("Senha Incorreta! Digite Novamente!");
            }
            else
            {
                System.out.println(">>> Acesso Concedido! <<<");
            }

        }while (!senhaUsuario.equals(senhaCorreta));

        teclado.close();
    }
}
