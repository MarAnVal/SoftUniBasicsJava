import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        //На първия ред – желаната печалба на клуба - реално число в интервала [1.00... 15000.00]
        //Поредица от два реда до получаване на командата "Party!" или до достигане на желаната печалба:
        //Име на коктейла – текст
        //Брой на коктейлите за поръчката – цяло число в интервала [1… 50]
        Scanner input = new Scanner(System.in);
        double income = Double.parseDouble(input.nextLine());
        String drinkName = input.nextLine();
        double check = 0;
        double total = 0;
        while (!drinkName.equals("Party!")){

            int drinkNumber = Integer.parseInt(input.nextLine());
            //цената на един коктейл е дължината неговото име.
            //Ако цената на една поръчка е нечетно число, има 25% отстъпка от цената на поръчката.
            check = drinkNumber * drinkName.length() * 1.0;
            if (check % 2 != 0){
                check *= 0.75;
            }
            total += check;
            if (total >= income){
                System.out.printf("Target acquired.%n");
                break;
            }
            drinkName = input.nextLine();
            if (drinkName.equals("Party!")){
                System.out.printf("We need %.2f leva more.%n", Math.abs(total - income));
            }
        }
        //При получена команда "Party!":
        // "We need {недостигаща сума} leva more."
        //При достигане на желаната печалба:
        //	"Target acquired."
        //След това да се отпечата:
        //	"Club income - {приходи от клуба} leva."
        //Парите да бъдат форматирани до втората цифра след десетичния знак.
        System.out.printf("Club income - %.2f leva.", total);
    }
}
