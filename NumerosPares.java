import java.util.Scanner;
public class NumerosPares
{
    public static void main(String[] args)
    {
        System.out.println(">>> NÚMEROS PARES <<<");

        //Cores para o terminal
        String reset = "\u001B[0m"; // Finalizar a cor no Final do texto
        String red = "\u001B[31m";
        String green = "\u001B[32m";


        Scanner teclado = new Scanner(System.in);
        String continuar; //Variavel de Verificação

        do
        {
            System.out.print("Digite o valor do INICIO: ");
            int inicio = teclado.nextInt();
            System.out.print("Digite o valor do FINAL: ");
            int fim = teclado.nextInt();

            if(inicio > fim)
            {
                System.out.println(red + ">>> Valor de início deve ser menor que o final! <<<"+ reset);

                System.out.print("Digite o valor do INICIO: ");
                inicio = teclado.nextInt();
                System.out.print("Digite o valor do FINAL: ");
                fim = teclado.nextInt();
            }

            //Calculo para pegar os números pares
            for (int cont = inicio; cont <= fim; cont++)
            {
                if (cont % 2 == 0)
                {
                    System.out.println(cont);
                }
            }
            //Verificando se o usuario que continuar
            System.out.print("Quer continuar?[S/N]: ");
            continuar = teclado.next();

        }while (continuar.equals("S") || continuar.equals("s"));

        System.out.println(green + ">>> PROGRAMA FINALIZADO! <<<" + reset);
        teclado.close();
    }
}
