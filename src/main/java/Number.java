import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Число меньше или равно 7");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат числа");
        }
    }
}
