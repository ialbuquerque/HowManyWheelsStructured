import java.util.Scanner;

public class Main {
    static String response = "";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (!response.equals("9")) {
            getUserInput();
            if (response.equals("1")) {
                System.out.println("\nA quantidade de rodas do carro é 4\n\n");
            } else if (response.equals("2")) {
                System.out.println("\nA quantidade de rodas da moto é 2\n\n");
            } else if (response.equals("9")) {
                System.out.println("Você está finalizando o programa!");
                break;
            } else {
                System.out.printf(String.format("A opção %s não é válida. Por favor, tente novamente!\n\n", response));
            }
        }
    }

    static void getUserInput() {
        System.out.print("Saiba quantas rodas tem o seu automóvel. Digite:\n" +
                "1 para carro\n" +
                "2 para moto\n" +
                "9 para sair\n" +
                "Resposta: ");
        response = scanner.nextLine();
    }
}
