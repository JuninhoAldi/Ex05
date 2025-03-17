import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificação para enviar:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        System.out.print("Digite a opção desejada: ");
        String choice = scanner.nextLine();

        System.out.print("Digite a mensagem a ser enviada: ");
        String message = scanner.nextLine();

        Notification notification = NotificationFactory.createNotification(choice);

        if (notification != null) {
            notification.send(message);
        }
    }
}
