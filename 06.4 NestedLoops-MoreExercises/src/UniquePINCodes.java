import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        //Първата и третата цифра трябва да бъдат четни.
        //Втората цифра трябва да бъде просто число в диапазона [2...7].
        //От конзолата се четат 3 реда:
        //Горната граница на първото число - цяло число в диапазона [1...9]
        //Горната граница на второто число - цяло число в диапазона [1...9]
        //Горната граница на третото число - цяло число в диапазона [1...9]
        Scanner input = new Scanner(System.in);
        int firstNumMax = Integer.parseInt(input.nextLine());
        int secondNumMax = Integer.parseInt(input.nextLine());
        int thurdNumMax = Integer.parseInt(input.nextLine());

        for (int i = 2; i <= firstNumMax; i++) {
            if ((i % 2) != 0) {
                continue;
            }
            for (int j = 2; j <= secondNumMax; j++) {
                int counter = 0;
                for (int n = 2; n <= j; n++) {
                    if (j % n == 0) {
                        counter++;
                    }
                }
                if (counter < 1) {
                    for (int k = 2; k <= thurdNumMax; k++) {
                        if ((k % 2) == 0) {
                            System.out.printf("%d %d% d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}






