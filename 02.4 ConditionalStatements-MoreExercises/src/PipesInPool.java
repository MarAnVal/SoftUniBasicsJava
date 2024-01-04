import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        //Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        //Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        //Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]
        //До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
        //"The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
        //Aко басейнът се е препълнил – с колко литра е прелял за даденото време.
        //"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."

        int v = Integer.parseInt(input.nextLine());
        int p1 = Integer.parseInt(input.nextLine());
        int p2 = Integer.parseInt(input.nextLine());
        double h = Double.parseDouble(input.nextLine());

        double full = h * (p1 + p2);
        if (full > v){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, full-v);
        } else {
            double percentFull = full * 100 /v;
            double percentP1 = p1 * h * 100 / full;
            double percentP2 = p2 * h * 100/ full;
            System.out.printf("The pool is %.2f", percentFull);
            System.out.print("% full. ");
            System.out.printf("Pipe 1: %.2f", percentP1);
            System.out.print("%. ");
            System.out.printf("Pipe 2: %.2f", percentP2);
            System.out.print("%.");


        }

    }
}
