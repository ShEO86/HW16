public class CheckСonfirmationPassword {
    public static void checkСonfirmationPassword(String pass, String confirm) {
        if (confirm.equals(pass)) {
            System.out.println("Пароль подтвержден");
        } else {
            throw new WrongConformationException("Подтверждение не совпадает с паролем");
        }
    }
}
