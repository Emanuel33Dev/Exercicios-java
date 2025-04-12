import java.util.Scanner;

public class DesenhandoComAsteriscos
{
    public static void main(String[] args)
    {
        System.out.println("===========================");
        System.out.println(" DESENHANDO COM ASTERISCOS ");
        System.out.println("===========================");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = teclado.nextInt();

        for(int cont = 1; cont <= valor; cont++)
        {
            for(int cont1 = 1; cont1 <= cont; cont1++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
