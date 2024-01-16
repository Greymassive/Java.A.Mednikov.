import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = Integer.parseInt(scanner.nextLine());

        try {
            if (length < 1) {
                throw new ArrayInputException("Длина массива должна быть больше 0");
            } else {
                int[] numbers = new int[length];

                for (int i = 0; i < length; i++) {
                    System.out.print("Введите элемент " + i + " массива: ");
                    numbers[i] = Integer.parseInt(scanner.nextLine());
                }

                System.out.print("Элементы массива, кратные 3: ");
                for (int number : numbers) {
                    if (number % 3 == 0) {
                        System.out.print(number + " ");
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат числа");
        } catch (ArrayInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
