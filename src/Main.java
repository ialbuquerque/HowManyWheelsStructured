import java.util.Scanner;

public class Main {
    static int response = -1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (response != 0) {
            getUserInput();
            if (response == 1) {
                System.out.println("\nA quantidade de rodas do carro é 4\n\n");
            } else if (response == 2) {
                System.out.println("\nA quantidade de rodas da moto é 2\n\n");
            } else if (response == 9) {
                System.out.println("Você está finalizando o programa!");
                break;
            } else {
                System.out.printf(String.format("A opção %s não é válida. Por favor, tente novamente!\n\n", response));
            }
        }
    }

    static void getUserInput() {
        System.out.println("Saiba quantas rodas tem o seu automóvel. Digite:\n1 para carro\n2 para moto\n9 para sair\nResposta: ");
        response = scanner.nextInt();
    }
}
