import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        // Ако всички двойки имат еднаква стойност, отпечатайте "Yes, value={Value}" + стойността.
        // В противен случай отпечатайте "No, maxdiff={Difference}" + максималната разлика.
        int min = 0;
        int max = 0;
        int summ1 = 0;
        int summ2 = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(input.nextLine());
            int b = Integer.parseInt(input.nextLine());
            summ2 = a + b;
            if (i == 0) {
                summ1 = summ2;
            } else {
                if (summ1 != summ2) {
                    if (min > Math.abs(summ1 - summ2)) {
                        min = Math.abs(summ1 - summ2);
                    } else if (max < Math.abs(summ1 - summ2)) {
                        max = Math.abs(summ1 - summ2);
                    }
                }

            }
            summ1 = summ2;
        }
        if (max - min != 0) {
            System.out.printf("No, maxdiff=%d", max);
        } else {
            System.out.printf("Yes, value=%d", summ2);
        }
    }
}
