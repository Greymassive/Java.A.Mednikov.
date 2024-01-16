import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        try {
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                throw new NameNotFoundException("Нет такого имени");
            }
        } catch (NameNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
