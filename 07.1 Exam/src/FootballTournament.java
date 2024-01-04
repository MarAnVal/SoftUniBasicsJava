import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        //Името на футболния отбор, за който водим статистика - текст
        //Броя изиграни срещи през настоящия сезон - цяло число в интервала [0… 100]
        // За всяка изиграна среща се прочита отделен ред:
        //Резултатът от изиграната среща в един от горепосочените формати – символ с възможности 'W', 'D' и 'L'
        Scanner input = new Scanner(System.in);
        String teamName = input.nextLine();
        int matches = Integer.parseInt(input.nextLine());
        int win = 0;
        int drow = 0;
        int loses = 0;
        for (int i = 0; i < matches; i++){
            String result = input.nextLine();
            switch (result){
                case "W":
                    //W - Отборът е победител и получава 3 точки
                    win ++;
                    break;
                case "D":
                    //D - Срещата е завършила без победител и отборът получава 1 точка
                    drow++;
                    break;
                case "L":
                    //L - Отборът е загубил срещата и не получава точки
                    loses++;
                    break;
            }
        }
        //Ако отборът не е изиграл нито един мач през настоящия сезон се извежда точно един ред в следния формат:
        //"{името на отбора} hasn't played any games during this season."
        if (matches == 0){
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            System.out.printf("%s has won %d points during this season.%n", teamName, win * 3 + drow);
            System.out.printf("Total stats:%n");
            System.out.printf("## W: %d%n", win);
            System.out.printf("## D: %d%n", drow);
            System.out.printf("## L: %d%n", loses);
            System.out.printf("Win rate: %.2f%%", win * 100.0/ matches);
        }
        //Ако отборът е изиграл един мач или повече се извеждат шест реда в следния формат:
        //"{името на отбора} has won {брой спечелени точки} points during this season"
        //"Total stats:"
        //"## W: {брой спечелени игри}"
        //"## D: {брой игри, завършили наравно}"
        //"## L: {брой загубени игри}"
        //"Win rate: {процент спечелени игри}%"
    }
}
