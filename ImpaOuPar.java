import java.util.Scanner;

public class ImpaOuPar
{
    public static void main(String[] args)
    {
        int calculo;

        //Pedindo a entrada do usuario
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeros = teclado.nextInt();

        calculo = numeros % 2;

        if(calculo == 0)
        {
            System.out.printf("Número %d é PAR!", numeros);
        }
        else if (calculo == 1)
        {
            System.out.printf("Número %d é IMPAR", numeros);
        }

        teclado.close();
    }
}
