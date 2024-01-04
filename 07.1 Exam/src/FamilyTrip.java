import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        //Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        //Брой нощувки – цяло число в интервала [0 … 1000]
        //Цена за нощувка – реално число в интервала [1.00 … 500.00]
        //Процент за допълнителни разходи – цяло число в интервала [0 … 100]
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());
        int nights = Integer.parseInt(input.nextLine());
        double nightsFee = Double.parseDouble(input.nextLine());
        int extraExpencesPercent = Integer.parseInt(input.nextLine());
        double total = 0;
        //ако броят на нощувките е по-голям от 7, цената за нощувка се намаля с 5%.
        if (nights > 7){
            nightsFee *= 0.95;
        }
        total = nights * nightsFee + extraExpencesPercent * budget / 100;
        //Ако сумата е достатъчна:
        //"Ivanovi will be left with {останали пари след почивката} leva after vacation."
        //Ако НЕ е достигната сумата:
        //"{парите нужни до достигане на целта} leva needed."
        //Сума трябва да се форматира до втората цифра след десетичния знак.
        if (total > budget){
            System.out.printf("%.2f leva needed.", Math.abs(total - budget));
        } else
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", Math.abs(total - budget));
    }
}
