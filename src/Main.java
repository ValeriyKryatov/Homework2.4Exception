public class Main {

    public static void main(String[] args) {
        try {
            UserValidator.check("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Введен корректный логин");
            System.out.println("Введен корректный пароль");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}