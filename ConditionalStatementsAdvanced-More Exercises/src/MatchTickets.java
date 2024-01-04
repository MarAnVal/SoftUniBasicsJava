import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
        //На втория ред е категорията – "VIP" или "Normal"
        //На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
        double budget = Double.parseDouble(input.nextLine());
        String kategoy = input.nextLine();
        int num = Integer.parseInt(input.nextLine());
        double total = 0.0;


        //броят на хората в групата определя какъв процент от бюджета трябва да се задели за транспорт
         switch (kategoy){
            case "VIP":
                //IP – 499.99 лева.
                total = 499.99 * num;
                //От 1 до 4 – 75% от бюджета.
                //От 5 до 9 – 60% от бюджета.
                //От 10 до 24 – 50% от бюджета.
                //От 25 до 49 – 40% от бюджета.
                //50 или повече – 25% от бюджета.
                if (num >= 50){
                    total = total + budget * 0.25;
                }else if (num >= 25){
                    total = total + budget * 0.4;
                }else if (num >= 10){
                    total = total + budget * 0.5;
                }else if (num >=5){
                    total = total + budget * 0.6;
                }else if (num >= 1){
                    total = total + budget * 0.75;
                }
                break;
            case "Normal":
                //Normal – 249.99 лева.
                total = 249.99 * num;
                //От 1 до 4 – 75% от бюджета.
                //От 5 до 9 – 60% от бюджета.
                //От 10 до 24 – 50% от бюджета.
                //От 25 до 49 – 40% от бюджета.
                //50 или повече – 25% от бюджета.
                if (num >= 50){
                    total = total + budget * 0.25;
                }else if (num >= 25){
                    total = total + budget * 0.4;
                }else if (num >= 10){
                    total = total + budget * 0.5;
                }else if (num >=5){
                    total = total + budget * 0.6;
                }else if (num >= 1){
                    total = total + budget * 0.75;
                }
                break;
        }
        if (total <= budget){
            System.out.printf("Yes! You have %.2f leva left.", budget - total);
        } else
            System.out.printf("Not enough money! You need %.2f leva.", total - budget);
        //Ако бюджетът е достатъчен:
        //"Yes! You have {останалите пари на групата} leva left."
        //Ако бюджетът НЕ Е достатъчен:
        //"Not enough money! You need {сумата, която не достига} leva."
    }

}
