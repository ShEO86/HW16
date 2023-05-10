import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        CheckLogin.checker(login);
        String password = scanner.nextLine();
        CheckPassword.checker(password);
        String confPassword = scanner.nextLine();
        CheckСonfirmationPassword.checkСonfirmationPassword(password, confPassword);
        scanner.close();
        System.out.println("Введенные данные корректны");

    }

}