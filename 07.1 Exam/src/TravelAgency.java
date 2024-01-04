import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Име на града - текст с възможности ("Bansko",  "Borovets", "Varna" или "Burgas")
        //2. Вид на пакета - текст с възможности ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        //3. Притежание на VIP отстъпка - текст с възможности  "yes" или "no"
        //4. Дни за престой - цяло число в интервала [1 … 10000]
        String town = input.nextLine();
        String pack = input.nextLine();
        String vip = input.nextLine();
        int days = Integer.parseInt(input.nextLine());
        double total = 0;
        if (days > 7){
            days--;
        }
        if (days > 0){
            switch (town){
            case "Bansko":
            case "Borovets":
                switch (pack){
                    case "noEquipment":
                        switch (vip){
                            case "yes":
                                total = days * 80 * 0.95;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                            case "no":
                                total = days * 80;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                        }
                        break;
                    case "withEquipment":
                        switch (vip){
                            case "yes":
                                total = days * 100 * 0.90;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                            case "no":
                                total = days * 100;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                        }
                        break;
                    default:
                        System.out.print("Invalid input!");
                        break;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (pack){
                    case "noBreakfast":
                        switch (vip){
                            case "yes":
                                total = days * 100 * 0.93;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                            case "no":
                                total = days * 100;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                        }
                        break;
                    case "withBreakfast":
                        switch (vip){
                            case "yes":
                                total = days * 130 * 0.88;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                            case "no":
                                total = days * 130;
                                System.out.printf("The price is %.2flv! Have a nice time!",total);
                                break;
                        }
                        break;
                    default:
                        System.out.print("Invalid input!");
                        break;
                }
                break;
            default:
                System.out.print("Invalid input!");
              break;
        }

        } else {
            System.out.print("Days must be positive number!");
        }

        //Когато потребителят е въвел всички данни правилно, отпечатваме:
        //"The price is {цената, форматирана до втория знак}lv! Have a nice time!"
        //Ако потребителят е въвел по-малко от 1 ден за престой, отпечатваме:
        //"Days must be positive number!"
        //Когато при въвеждането на града или вида на пакета се въведат невалидни данни, отпечатваме: "Invalid input!"

    }
}
