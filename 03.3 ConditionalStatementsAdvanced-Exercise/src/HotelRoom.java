import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //На първия ред е месецът – May, June, July, August, September или October
        //На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        String month = input.nextLine();
        int num = Integer.parseInt(input.nextLine());
        double studio = 0.0;
        double apartment = 0.0;

        //              Май и октомври       Юни и септември         Юли и август
        //Студио –      50 лв./нощувка       75.20 лв./нощувка       76 лв./нощувка
        //Апартамент –  65 лв./нощувка       68.70 лв./нощувка       77 лв./нощувка

        switch (month){
            case "May":
            case "October":
                //За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
                //За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
                //За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление
                studio = 50.0 * num;
                apartment = 65.0 * num;
                if (num >14){
                    studio = studio * 0.7; apartment = apartment * 0.9;
                } else if (num > 7){studio = studio * 0.95;}
                break;
            case "June":
            case "September":
                //За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
                //За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление
                studio = 75.2 * num;
                apartment = 68.7 * num;
                if (num >14){
                    studio = studio * 0.8; apartment = apartment * 0.9;
                }
                break;
            case "August":
            case "July":
                //За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление
                studio = 76.0 * num;
                apartment = 77.0 * num;
                if (num >14){
                    apartment = apartment * 0.9;
                }
                break;
        }

        //На първия ред: "Apartment: {цена за целият престой} lv."
        //На втория ред: "Studio: {цена за целият престой} lv."
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);

    }
}
