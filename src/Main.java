import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Saiba quantas rodas tem o seu automóvel. Digite:\n1 para carro\n2 para moto\nResposta: ");
        getInput();
    }

    private static void getInput() {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        processResponse(response);
    }

    private static void processResponse(String response) {
        if (response.equals("1")) {
            sendMessageAboutCar();
        } else if (response.equals("2")) {
            sendMessageAboutMotorcycle();
        } else {
            sendNotAValidOptionMessage(response);
        }
        main(null);
    }

    private static void sendNotAValidOptionMessage(String response) {
        System.out.printf(String.format("A opção %s não é válida. Por favor, tente novamente!\n\n", response));
    }

    private static void sendMessageAboutMotorcycle() {
        System.out.println("\nA quantidade de rodas da moto é 2\n\n");
    }

    private static void sendMessageAboutCar() {
        System.out.println("\nA quantidade de rodas do carro é 4\n\n");
    }
}
