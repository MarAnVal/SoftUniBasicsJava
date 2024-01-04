import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предпазен найлон - 1.50 лв. за кв. метър
        // Боя - 14.50 лв. за литър
        // Разредител за боя - 5.00 лв. за литър
        //добави още 10% от количеството боя
        // и 2 кв.м. найлон
        // 0.40 лв. за торбички.
        // за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
        //1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3. Количество разредител (в литри) - цяло число в интервала [1…30]
        //4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

        int neededNylon = Integer.parseInt(input.nextLine());
        int neededPaint = Integer.parseInt(input.nextLine());
        int neededCleaner = Integer.parseInt(input.nextLine());
        int neededHouers = Integer.parseInt(input.nextLine());

        double sum = (neededNylon +2) * 1.5 + neededPaint * 1.1 * 14.5 + neededCleaner * 5 + 0.4;
        double total = sum + sum * 0.3 * neededHouers;

        System.out.println(total);



    }
}
