import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num1 = 0, num2 = 1, fibonacci;
        String numeroSequencia = "", escolha;

        System.out.println("Sequencia Fibonacci");

        do{
            fibonacci = num1 + num2;

            num2 = num1;
            num1 = fibonacci;

            numeroSequencia += fibonacci + " ";

            System.out.println(numeroSequencia);
            System.out.println("Ddigite x para continuar, qualquer outra letra para parar: ");
            escolha = input.next().toLowerCase();

        }while(escolha.equals("x"));
    }
}
