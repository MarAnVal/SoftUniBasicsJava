import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Сезонът – текст - “Winter”, “Spring” или “Summer”;
        //2. Видът на групата – текст - “boys”, “girls” или “mixed”;
        //3. Брой на учениците – цяло число в интервала [1 … 10000];
        //4. Брой на нощувките – цяло число в интервала [1 … 100].
        String season = input.nextLine();
        String gender = input.nextLine();
        int num = Integer.parseInt(input.nextLine());
        int overnights = Integer.parseInt(input.nextLine());
        String sport = "";
        double total = 0.0;

        //             Winter                 Spring                Summer
        //girls        9.60 / Gymnastics      7.20 / Athletics      15 / Volleyball
        //boys         9.60 / Judo            7.20 / Tennis         15 / Football
        //mixed        10 / Ski               9.50 / Cycling        20 / Swimming
        //Ако броят на учениците е 50 или повече, училището получава 50% отстъпка
        //Ако броят на учениците е 20 или повече и в същото време по-малък от 50, училището получава 15% отстъпка
        //Ако броят на учениците е 10 или повече и в същото време по-малък от 20, училището получава 5% отстъпка
        switch (season){
            case "Winter":
                switch (gender){
                    case "girls":
                        total = overnights * 9.6 * num; sport = "Gymnastics";
                        break;
                    case "boys":
                        total = overnights * 9.6 * num; sport = "Judo";
                        break;
                    case "mixed":
                        total = overnights * 10 * num; sport = "Ski";
                        break;
                }
                if (num >= 50){
                    total = total * 0.5;
                } else if (num >= 20){
                    total = total * 0.85;
                }else if (num >= 10){
                    total = total * .095;
                }
                break;
            case "Spring":
                switch (gender){
                    case "girls":
                        total = overnights * 7.2 * num; sport = "Athletics";
                        break;
                    case "boys":
                        total = overnights * 7.2 * num; sport = "Tennis";
                        break;
                    case "mixed":
                        total = overnights * 9.5 * num; sport = "Cycling";
                        break;
                }
                if (num >= 50){
                    total = total * 0.5;
                } else if (num >= 20){
                    total = total * 0.85;
                }else if (num >= 10){
                    total = total * 0.95;
                }
                break;
            case "Summer":
                switch (gender){
                    case "girls":
                        total = overnights * 15 * num; sport = "Volleyball";
                        break;
                    case "boys":
                        total = overnights * 15 * num; sport = "Football";
                        break;
                    case "mixed":
                        total = overnights * 20 * num; sport = "Swimming";
                        break;
                }
                if (num >= 50){
                    total = total * 0.5;
                } else if (num >= 20){
                    total = total * 0.85;
                }else if (num >= 10){
                    total = total * .095;
                }
                break;
        }
        //Спортът, който са практикували учениците и цената за нощувките, която е заплатило училището,
        //форматирана до втория знак след десетичната запетая, в следния формат:
        //"{спортът} {цената} lv.“
        System.out.printf("%s %.2f lv.", sport, total);
    }
}
