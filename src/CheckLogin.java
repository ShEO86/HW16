public class CheckLogin {
    public static void checker(String login) {
        if (lenghtChecker(login) && simbolChecker(login)) {
            System.out.println("Login is correct.");
        } else {
            throw new WrongLoginException("Incorrect login.");
        }

    }

    private static boolean lenghtChecker(String login) {
        return login.length() <= 20;
    }

    private static boolean simbolChecker(String login) {
        String s = "qwertyuiopasdfghjklzxcvbnm1234567890_";
        login  = login.toLowerCase();
        for (int i = 0; i < login.length(); i++) {
            if (s.contains(Character.toString(login.charAt(i))) == false) {
                return false;
            }
        }
        return true;
    }


}
