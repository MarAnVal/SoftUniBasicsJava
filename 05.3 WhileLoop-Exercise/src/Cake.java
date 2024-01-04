import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        //е размерите на тортата в сантиметри (широчина и дължина – цели числа в интервала [1...1000])
        //и след това на всеки ред, до получаване на командата "STOP"
        //или докато не свърши тортата, броят на парчетата, които гостите вземат от нея.
        //Парчетата са квадратни с размер 1 см .
        //Да се отпечата на конзолата един от следните редове:
        //"{брой парчета} pieces are left." - ако стигнете до STOP и има останали парчета торта.
        //"No more cake left! You need {брой недостигащи парчета} pieces more."
        Scanner input = new Scanner(System.in);
        int w = Integer.parseInt(input.nextLine());
        int h = Integer.parseInt(input.nextLine());
        int pices = w * h;

        while (pices > 0){
           String taken = input.nextLine();
           switch (taken){
               case "STOP":
                   System.out.printf("%d pieces are left.", pices);
                   pices = 0;
                   break;
               default:
                   pices -= Integer.parseInt(taken);
                   if (pices <= 0){
                       System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pices));
                   }
                   break;
           }

        }
    }
}
