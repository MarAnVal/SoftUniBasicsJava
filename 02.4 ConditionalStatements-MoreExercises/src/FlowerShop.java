import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //От общата сума, Мария трябва да плати 5% данъци.
        //Брой магнолии – цяло число в интервала [0 … 50]; Магнолии – 3.25 лева
        //Брой зюмбюли – цяло число в интервала [0 … 50]; Зюмбюли – 4 лева
        //Брой рози – цяло число в интервала [0 … 50];Рози – 3.50 лева
        //Брой кактуси – цяло число в интервала [0 … 50]; Кактуси – 8 лев
        //Цена на подаръка – реално число в интервала [0.00 … 500.00]
        //Ако парите СА стигнали: "She is left with {останали} leva."
        // сумата трябва да е закръглена към по-малко цяло число (пр. 1.90 -> 1).
        //Ако парите НЕ достигат: "She will have to borrow {останали} leva."
        // сумата трябва да е закръглена към по-голямо цяло число (пр. 1.10 -> 2).

        int magnolii = Integer.parseInt(input.nextLine());
        int zomliuli = Integer.parseInt(input.nextLine());
        int rozi = Integer.parseInt(input.nextLine());
        int kaktusi = Integer.parseInt(input.nextLine());
        double podarak = Double.parseDouble(input.nextLine());

        double total = magnolii * 3.25 + zomliuli * 4 + rozi * 3.5 + kaktusi * 8;
        double afterTaxx = total * 0.95;

        if (afterTaxx < podarak){
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(podarak - afterTaxx));
        } else
            System.out.printf("She is left with %.0f leva.", Math.floor(afterTaxx - podarak));




    }
}
