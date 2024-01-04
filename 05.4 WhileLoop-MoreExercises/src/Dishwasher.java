import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        //Брой бутилки от препарат, който ще бъде използван за миенето на чинии - цяло число в интервала [1…10]
        //На всеки следващ ред, до получаване на командата "End"
        //или докато количеството препарат не се изчерпи,
        //брой съдове, които трябва да бъдат измити - цяло число в интервала [1…100]
        Scanner input = new Scanner(System.in);
        int bottles = Integer.parseInt(input.nextLine());
        //1 бутилка съдържа 750 мл. препарат
        //за 1 чиния са нужни 5 мл.
        //за тенджера 15 мл
        //Приемете, че на всяко трето зареждане със съдове, съдомиялната се пълни само с тенджери, а останалите пъти с чинии.
        int detergent = bottles * 750;
        int washFlag = 1;
        int dishesCount = 0;
        int potsCount = 0;
        boolean end = true;
        while (end) {
            String charging = input.nextLine();
            switch (charging) {
                case "End":
                    System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.", dishesCount, potsCount, detergent);
                    end = false;
                    break;
                default:
                    if (washFlag % 3 != 0) {

                        dishesCount += Integer.parseInt(charging);
                        detergent -= Integer.parseInt(charging) * 5;
                        washFlag++;
                    } else {

                        potsCount += Integer.parseInt(charging);
                        detergent -= Integer.parseInt(charging) * 15;
                        washFlag++;
                    }
                    break;
            }
            if (detergent < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
                break;
            }

        }
        //В случай, че количеството препарат е било достатъчно за измиването на съдовете:
        //"Detergent was enough!"
        //"{брой чисти чинии} dishes and {брой чисти тенджери} pots were washed."
        //"Leftover detergent {количество останал препарат} ml."
        //В случай, че количеството препарат не е било достатъчно за измиването на съдовете:
        //"Not enough detergent, {количество не достигнал препарат} ml. more necessary!"
    }
}

