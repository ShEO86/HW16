import java.util.Objects;

public class Validator {
    private Validator() {
    }

    public static boolean validator(String login, String password, String confPassword){
        try {
            check(login, password, confPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void check(String login, String password, String confPassword)
        throws WrongLoginException, WrongPasswordException{
            if (Objects.isNull(login) || login.length() > 20) {
                throw new WrongLoginException("Длинна логина не должна превышать 20 символов");
            }
            if (Objects.isNull(password) || password.length() >= 20) {
                throw new WrongPasswordException("Длинна пароля должна быть менее 20 символов");
            }
            if (!checkSymbols(login)) {
                throw new WrongLoginException("В логине использованы недопустимые символы");
            }
            if (!checkSymbols(password)) {
                throw new WrongPasswordException("В пароле использованы недопустимые символы");
            }
            if (!password.equals(confPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение должны совпадать");
            }



        }

    private static boolean checkSymbols(String word) {
        String s = "qwertyuiopasdfghjklzxcvbnm1234567890_";
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        for (char currentChar : chars) {
            if (!s.contains(Character.toString(currentChar))) {
                return false;
            }
        }
        return true;
    }

}

