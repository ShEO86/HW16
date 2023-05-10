import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("\nВведите пароль: ");
        String password = scanner.nextLine();
        System.out.println("\nВведите подтверждение пароля: ");
        String confPassword = scanner.nextLine();
        scanner.close();
        boolean checking = Validator.validator(login, password, confPassword);
//        boolean checking = Validator.validator("!1", "qwerty123", "qwerty123");
        if (checking) {
            System.out.println("Введенные данные корректны.");
        }

    }

}