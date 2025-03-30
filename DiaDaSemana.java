import java.util.Scanner;

public class DiaDaSemana
{
    public static void main(String[] args)
    {
        String semana;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int num = teclado.nextInt();

        switch (num)
        {
            case 1:
                semana = "Segunda - Feira";
                System.out.println("Hoje é " + semana);
                break;
            case 2:
                semana = "Terça - Feira";
                System.out.println("Hoje é " + semana);
                break;
            case 3:
                semana = "Quarta - Feira";
                System.out.println("Hoje é " + semana);
                break;
            case 4:
                semana = "Quinta - Feira";
                System.out.println("Hoje é " + semana);
                break;
            case 5:
                semana = "Sexta - Feira";
                System.out.println("Hoje é " + semana);
                break;
            case 6:
                semana = "Sabado";
                System.out.println("Hoje é " + semana);
                break;
            case 7:
                semana = "Domingo";
                System.out.println("Hoje é " + semana);
                break;
            default:
                semana = "ERRO!! Digite um valor entre 1 e 7.";
                System.out.println(semana);
                break;
        }

        teclado.close();
    }
}
