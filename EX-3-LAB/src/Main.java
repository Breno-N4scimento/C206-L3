import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int senha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("entre com a a senha: ");
        senha= entrada.nextInt();

        if(senha==2002)
            System.out.println("acesso permitido");
        else
        {
            System.out.println("Senha Invalida");
            while (senha != 2002)
            {
                senha = entrada.nextInt();
            }
            System.out.println("acesso permitido");
        }
    }
}