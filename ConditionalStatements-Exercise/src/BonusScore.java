import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        //Дадено е цяло число – начален брой точки
        // пресмята бонус точките, които получава числото и общия брой точки (числото + бонуса).
        //· Ако числото е до 100 включително, бонус точките са 5.
        //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        //· Допълнителни бонус точки (начисляват се отделно от предходните):
        //o За четно число à + 1 т.
        //o За число, което завършва на 5 à + 2 т.

        Scanner input = new Scanner(System.in);

        double score = Double.parseDouble(input.nextLine());
        double bonus = 0;

        if (score <= 100){
            bonus = 5;
        } else if (score <= 1000) {
            bonus = score * 0.2;
        } else
            bonus = score * 0.1;

        if (score % 2 == 0) {
        bonus++;
        } else if (score % 5 == 0) {
            bonus++; bonus++;
        }

        System.out.printf("%f%n%f", bonus, bonus+score);


    }
}
