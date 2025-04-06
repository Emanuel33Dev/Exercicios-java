import java.util.Scanner;

public class ParaNoNegativo
{
    public static void main(String[]args)
    {
        int soma = 0;
        int num;

        Scanner teclado = new Scanner(System.in);
        do
        {
            System.out.print("Digite um número: ");
            num = teclado.nextInt();

            if (num > 0)
            {
                soma += num;
            }
        }while (num > -1);
        System.out.println("A soma dos valores foi: " + soma);

        teclado.close();
    }
}
