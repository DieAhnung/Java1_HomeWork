import java.util.Scanner;

public class ThirdHomeWork {
    /* Написать программу, которая загадывает случайное число от 0 до 9
и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
больше ли указанное пользователем число, чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 9);

        do {
            System.out.println("Введите число от 0 до 9");
            int userNumber = scanner.nextInt();
            if (userNumber > randomNumber || userNumber < randomNumber) {
                for (int cnt = 2; cnt > 0; --cnt) {

                    if (userNumber > randomNumber) {
                        System.out.println("Загаданное число меньше.");
                        System.out.println("Попробуйте снова");
                        Scanner newscannerT = new Scanner(System.in);
                        int scannerttwo = newscannerT.nextInt();
                        userNumber = scannerttwo;

                    } else if (userNumber < randomNumber) {
                        System.out.println("Загаданное число больше");
                        System.out.println("Попробуйте снова");

                        Scanner newscnnaerThr = new Scanner(System.in);
                        int newScannerThree = newscnnaerThr.nextInt();
                        userNumber = newScannerThree;

                    } else {
                        System.out.println("Вы угадали!");
                        break;
                    }

                }
                if (userNumber > randomNumber || userNumber < randomNumber) {
                    System.out.println("Вы проиграли. Загаданное число: " + randomNumber);

                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner newscanneT = new Scanner(System.in);
        }
        while (scanner.nextInt() == 1);


    }
}


