import java.util.Scanner;
import java.io.Console;

public class LoginSimples
{
    public static void main(String[] args)
    {
        System.out.println("===========================");
        System.out.println("       LOGIN SIMPLES       ");
        System.out.println("===========================");

        //Armazenamento do Login
        //Login: admin
        //Senha: 1234

        String usuario;
        String senha;
        Scanner teclado = new Scanner(System.in);


        while (true)
            {
                System.out.print("Usuario: ");
                usuario = teclado.nextLine();

                System.out.print("Senha: ");
                senha = teclado.nextLine();

                if (usuario.equals("admin") && senha.equals("1234"))
                {
                    System.out.println("Login Realizado com Sucesso!");
                    break;
                }
                else
                {
                    System.out.println("Login está INCORRETO! Tente Novamente.");
                }
            }

        teclado.close();
    }
}

