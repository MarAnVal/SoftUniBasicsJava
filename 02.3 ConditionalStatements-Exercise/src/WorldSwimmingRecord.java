import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        //1. Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3. Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
        //съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        //· Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
        //"Yes, he succeeded! The new world record is {времето на Иван} seconds."
        //· Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
        //"No, he failed! He was {недостигащите секунди} seconds slower."

        Scanner input = new Scanner(System.in);
        double record = Double.parseDouble(input.nextLine());
        double lenght = Double.parseDouble(input.nextLine());
        double secPerMeter = Double.parseDouble(input.nextLine());

        double ivan = lenght * secPerMeter;
        double extra = Math.floor(lenght/15)*12.5;
        double total = ivan + extra;


        if (total < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",total);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", total - record);
        }


    }
}
