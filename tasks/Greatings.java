import java.util.Scanner;
public class Greatings {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);
        scanner.close();
    }
}
