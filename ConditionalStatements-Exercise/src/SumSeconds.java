import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        //Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50)
        // чете времената на състезателите в секунди, въведени от потребителя
        // пресмята сумарното им време във формат "минути:секунди".
        // Секундите да се изведат с водеща нула (2 à "02", 7 à "07", 35 à "35")

        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        int sum = a + b + c;
        if (sum%60 < 10){
            System.out.printf("%d:0%d", sum/60, sum%60);
        } else
            System.out.printf("%d:%d", sum/60, sum%60);

    }
}
