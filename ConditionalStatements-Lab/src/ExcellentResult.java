import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        //чете оценка (цяло число), въведена от потребителя
        // отпечатва "Excellent!" ако оценката е 5 или по-висока.
        Scanner input = new Scanner(System.in);

        int grade = Integer.parseInt(input.nextLine());
        if (grade >= 5){
            System.out.println("Excellent!");
        }

    }
}
