public class CheckPassword {

    public static void checker(String pass) {
        if (passLenghtChecker(pass) && passSimbolChecker(pass)) {
            System.out.println("Password is correct.");
        } else {
            throw new WrongPasswordException("Incorrect password.");
        }
    }

    private static boolean passLenghtChecker(String pass) {
        return pass.length() <= 20;
    }

    private static boolean passSimbolChecker(String pass) {
        String s = "qwertyuiopasdfghjklzxcvbnm1234567890_";
        pass = pass.toLowerCase();
        for (int i = 0; i < pass.length(); i++) {
            if (s.contains(pass.substring(i, i + 1)) == false) {
                return false;
            }
        }
        return true;
    }
}
