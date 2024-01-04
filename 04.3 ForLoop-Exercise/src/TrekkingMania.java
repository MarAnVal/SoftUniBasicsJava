import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
        //За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
        int n = Integer.parseInt(input.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input.nextLine());
            //Група до 5 човека – изкачват Мусала
            //Група от 6 до 12 човека – изкачват Монблан
            //Група от 13 до 25 човека – изкачват Килиманджаро
            //Група от 26 до 40 човека – изкачват К2
            //Група от 41 или повече човека – изкачват Еверест
            if (num > 40){
                p5 = p5 + num;
            }else if (num >25){
                p4 = p4 + num;
            }else if (num > 12){
                p3 = p3 + num;
            }else if (num > 5){
                p2 = p2 + num;
            }else p1 = p1 + num;
            total = total + num;
        }
        System.out.printf("%n%.2f", p1*100.0/total);System.out.print("%");
        System.out.printf("%n%.2f", p2*100.0/total);System.out.print("%");
        System.out.printf("%n%.2f", p3*100.0/total);System.out.print("%");
        System.out.printf("%n%.2f", p4*100.0/total);System.out.print("%");
        System.out.printf("%n%.2f", p5*100.0/total);System.out.print("%");
        //Първи ред - процентът изкачващи Мусала
        //Втори ред – процентът изкачващи Монблан
        //Трети ред – процентът изкачващи Килиманджаро
        //Четвърти ред – процентът изкачващи К2
        //Пети ред – процентът изкачващи Еверест
        //точност до втората цифра след десетичната запетая.
    }
}
