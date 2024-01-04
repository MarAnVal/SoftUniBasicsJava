import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
        //Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
        //Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"
        int juniour = Integer.parseInt(input.nextLine());
        int senior = Integer.parseInt(input.nextLine());
        String type = input.nextLine();
        double total = 0.0;
        //Група     trail    cross-country    downhill    road
        //juniors   5.50     8                12.25         20
        //seniors     7      9.50             13.75         21.50
        //Ако в "cross-country" състезанието се съберат 50 или повече участника(общо младши и старши), таксата  намалява с 25%.
        //Организаторите отделят 5% процента от събраната сума за разходи.
        switch (type){
            case "trail":
                total = (juniour*5.5 + senior*7.0) * 0.95;
                break;
            case "cross-country":
                if (juniour + senior >= 50){
                    total = (juniour * 8 + senior * 9.5) * 0.95;
                    total = total * 0.75;
                } else total = (juniour * 8 + senior * 9.5) * 0.95;
                break;
            case "downhill":
                total = (juniour * 12.25 + senior * 13.75) * 0.95;
                break;
            case "road":
                total = (juniour * 20 + senior * 21.5) * 0.95;
                break;
        }
        //"{дарената сума}" - форматирана с точност до 2 знака след десетичната запетая.
        System.out.printf("%.2f", total);
    }
}
