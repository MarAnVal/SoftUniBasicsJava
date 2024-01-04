import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Възрастта на Лили - цяло число в интервала [1...77]
        //Цената на пералнята - число в интервала [1.00...10 000.00]
        //Единична цена на играчка - цяло число в интервала [0...40]
        int age = Integer.parseInt(input.nextLine());
        double wash = Double.parseDouble(input.nextLine());
        int toyPrice = Integer.parseInt(input.nextLine());
        double total = 0.0;
        //За нечетните рождени дни (1, 3, 5...n) получава играчки.
        //За четните рождени дни (2, 4, 6...n) получава пари. За втория рожден ден получава 10.00 лв, като сумата се увеличава с 10.00 лв
        //За всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.)
        //Братът на Лили, в годините, които тя получава пари, взима по 1.00 лев от тях
        //Лили продала играчките получени през годините, всяка за P лева и добавила сумата към спестените пари
        //С парите искала да си купи пералня за X лева. Напишете програма, която да пресмята, колко пари е събрала и дали ѝ стигат да си купи пералня.
        for (int i = 1; i <= age; i++){
            if (i % 2 == 0) {
                double summ = 10.0 * i /2 - 1;
                total = total + summ;
            } else
                total = total + toyPrice;
        }
        //Ако парите на Лили са достатъчни:
        // "Yes! {N}" - където N е остатъка пари след покупката
        //Ако парите не са достатъчни:
        // "No! {М}" - където M е сумата, която не достига
        if (wash <= total){
            System.out.printf("Yes! %.2f", total - wash);
        } else
            System.out.printf("No! %.2f", Math.abs(total - wash));
    }
}
