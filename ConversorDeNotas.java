import java.util.Scanner;

public class ConversorDeNotas
{
    public static void main(String[] args)
    {
        System.out.println("=====================");
        System.out.println("  Conversor de Notas  ");
        System.out.println("=====================");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digte seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a nota de 0 a 10: ");
        double nota = teclado.nextDouble();

        if(nota >= 9 && nota <= 10)
        {
            System.out.println("Aluno: " + nome);
            System.out.println("Nota: A");
        }
        else if(nota >= 7 && nota <= 8.9)
        {
            System.out.println("Aluno: " + nome);
            System.out.println("Nota: B");
        }
        else if(nota >= 5 && nota <= 6.9)
        {
            System.out.println("Aluno: " + nome);
            System.out.println("Nota: C");
        }
        else if(nota >= 3 && nota <= 4.9)
        {
            System.out.println("Aluno: " + nome);
            System.out.println("Nota: D");
        }
        else if(nota >= 0 && nota <= 2.9)
        {
            System.out.println("Aluno: " + nome);
            System.out.println("Nota: F");
        }
        else
        {
            System.out.println("ERRO, Digite uma NOTA VÁLIDA!");
        }

        teclado.close();
    }
}
