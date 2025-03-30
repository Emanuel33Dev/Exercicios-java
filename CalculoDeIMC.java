import java.util.Scanner;
import java.lang.Math;

public class CalculoDeIMC
{
    public static void main(String[] args)
        {
            System.out.println("=====================");
            System.out.println("    CALCULO DO IMC    ");
            System.out.println("=====================");
            Scanner teclado = new Scanner(System.in);
            //Pedindo o peso ao usuario
            System.out.print("Diga seu peso (KG): ");
            double peso = teclado.nextDouble();

            //Pedindo a altura ao usuario
            System.out.print("Diga sua altura: ");
            double altura = teclado.nextDouble();

            double imc = peso / Math.pow(altura, 2);

            if(imc < 18.5)
            {
                System.out.printf("IMC atual de: %.2f\n", imc);
                System.out.println("Abaixo do Peso!");
            }
            else if(imc > 18.5 && imc <= 24.9)
            {
                System.out.printf("IMC atual de: %.2f\n", imc);
                System.out.println("Peso Ideal");
            }
            else if(imc >= 25 && imc <= 29.9)
            {
                System.out.printf("IMC atual de: %.2f\n", imc);
                System.out.println("Sobrepeso");
            }
            else if (imc >= 30)
            {
                System.out.printf("IMC atual de: %.2f\n", imc);
                System.out.println("Obesidade!");
            }
            teclado.close();
        }
}
