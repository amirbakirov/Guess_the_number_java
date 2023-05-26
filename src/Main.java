import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру \"Угадай число\"!\nВведите число:");
        int r = getRandom(0, 100);
        int x;
        while (true) {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
            } else {
                System.out.println("Некорректный ввод. Попробуйте снова:");
                sc.next();
                continue;
            }
            if (x < r) {
                System.out.println("Введенное число меньше загадонного. " + x + " < \"число\"");
            } else if (x > r) {
                System.out.println("Введенное число больше загадонного. " + x + " > \"число\"");
            } else {
                System.out.println("Вы угадали число - " + x);
                break;
            }
        }
    }

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) - min);
    }
}