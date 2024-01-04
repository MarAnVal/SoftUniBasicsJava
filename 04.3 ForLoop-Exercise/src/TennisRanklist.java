import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Брой турнири, в които е участвал – цяло число в интервала [1…20]
        //Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        //За всеки турнир се прочита отделен ред:
        //Достигнат етап от турнира – текст – "W", "F" или "SF"
        int n = Integer.parseInt(input.nextLine());
        int startingPoints = Integer.parseInt(input.nextLine());
        int w = 0;
        int points = 0;
        for (int i = 0; i < n; i++){
            String type = input.nextLine();
            //W - ако е победител получава 2000 точки
            //F - ако е финалист получава 1200 точки
            //SF - ако е полуфиналист получава 720 точки
            switch (type){
                case "W":
                    points = points + 2000; w++; break;
                case "F":
                    points = points + 1200; break;
                case "SF":
                    points = points + 720; break;
            }
        }
        //"Final points: {брой точки след изиграните турнири}"
        //"Average points: {средно колко точки печели за турнир}"
        //"{процент спечелени турнири}%"
        //Средните точки да бъдат закръглени към най-близкото цяло число надолу,
        //а процентът да се форматира до втората цифра след десетичния знак.
        System.out.printf("%nFinal points: %d", points + startingPoints);
        System.out.printf("%nAverage points: %.0f", Math.floor(points * 1.0 / n));
        System.out.printf("%n%.2f", w * 100.0/n);System.out.print("%");
    }
}
