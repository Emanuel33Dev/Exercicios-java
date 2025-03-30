import java.util.Scanner;

public class ContagemRegressiva
{
    public static void main(String[] args)
    {
        int cont = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        while(cont < num)
        {
            System.out.print(cont + 1 + " ");
            cont++;
        }
        teclado.close();
    }
}
