import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int N1;
        int N2;
        int op;

        Scanner entrada = new Scanner(System.in);

        System.out.println("N1: ");
        N1 = entrada.nextInt();

        System.out.println("N2: ");
        N2=entrada.nextInt();

        System.out.println("1-adicao| 2-subtracao| 3-multiplicacao| 4-divisao| 5-exponencial: ");
        op = entrada.nextInt();

        if(op==1)
            System.out.println(N1+N2);
        if(op==2)
            System.out.println(N1-N2);
        if(op==3)
            System.out.println(N1*N2);
        if(op==4)
            System.out.println(N1/N2);
        if(op==5)
            System.out.println( Math. pow(N1, N2));
    }
}