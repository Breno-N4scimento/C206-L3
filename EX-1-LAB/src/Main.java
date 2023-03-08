import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double peso;
        double altura;
        double IMC;
        double cont;


        Scanner entrada = new Scanner(System.in);
        System.out.println("peso: ");
        peso = entrada.nextInt();

        System.out.println("altura: ");
        altura=entrada.nextInt();

        cont=altura*altura;

        IMC=peso/cont;

        System.out.println("imc= "+ IMC);

       if(IMC<18.5)
           System.out.println("abaixo do peso");
       else if(IMC>18.6 && IMC<24.9)
           System.out.println("peso ideal");
       else if(IMC>25 && IMC<29.9)
           System.out.println("levemente acima do peso");
       else if(IMC>30 && IMC<34.9)
           System.out.println("obesidade grau 1");
       else if(IMC>35 && IMC<39.9)
           System.out.println("obesidade grau 2");
       else if(IMC>40)
           System.out.println("obesidade morbida");

       entrada.close();
    }
}