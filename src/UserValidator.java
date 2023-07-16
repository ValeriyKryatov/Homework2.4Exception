public class UserValidator {

    private static final String ALLOWED_CHARS = "abcdefghijkimnopqrstuvwxyz0123456789_";

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Введенный логин не может быть длиннее 20 символов!");
        }
        if (!checkAlphabet(login)) {
            throw new WrongLoginException("Введенные данные некорректны!");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Введенный пароль не может быть длиннее 20 символов!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Веденные пароли не совпадают!");
        }
        if (!checkAlphabet(password)) {
            throw new WrongPasswordException("Введенные данные некорректны!");
        }
    }

    private static boolean checkAlphabet(String str) {
        var lowercase = str.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            var c = lowercase.charAt(i);
            if (!ALLOWED_CHARS.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}